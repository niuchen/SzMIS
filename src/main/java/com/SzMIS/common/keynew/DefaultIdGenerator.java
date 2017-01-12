package com.SzMIS.common.keynew;

 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;


/**
 * 默认的ID生成器, 采用前缀+时间+原子数的形式实现
 * 建议相同的配置采用同一个实例
 *  是系统全局BEAN 在系统内注入引用,不需要New @Repository("DefaultIdGenerator")
 *  @Resource(name="DefaultIdGenerator")
 *	IdGenerator idGenerator ;
 *	public void setIdGenerator(IdGenerator idGenerator) {
 *		this.idGenerator = idGenerator;
 *	}
 * @see IdGeneratorConfig
 * @author Ivan.Ma
 */
@Repository("DefaultIdGenerator")
public class DefaultIdGenerator implements IdGenerator, Runnable{
  
  private String time;
  
  private AtomicInteger value;
  
  private static final DateFormat FORMATTER = new SimpleDateFormat("yyyyMMddHHmmss");
  
  private IdGeneratorConfig config;
  
  private Thread thread;
  
  private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  
//  @Override
//  public void setconfig(IdGeneratorConfig config) {
//	 this.config=config;
//   }
  
  public DefaultIdGenerator(){
    config = new DefaultIdGeneratorConfig();
    time = DefaultIdGenerator.FORMATTER.format(new Date());
    value = new AtomicInteger(config.getInitial());
    
    thread = new Thread(this);
    thread.setDaemon(true);
    thread.start();
//    System.out.println("-------1");
//    System.out.println("-------1");
//    System.out.println("-------1");
//    System.out.println("-------1");
//    System.out.println("-------1");
  }
  
  public DefaultIdGenerator(IdGeneratorConfig config){
    this.config = config;
    time = DefaultIdGenerator.FORMATTER.format(new Date());
    value = new AtomicInteger(config.getInitial());
    
    thread = new Thread(this);
    thread.setDaemon(true);
    thread.start();
//    System.out.println("-------2");
//    System.out.println("-------2");
//    System.out.println("-------2");
//    System.out.println("-------2");
//    System.out.println("-------2");
  }
  
  @Override
  public String next() {
    lock.readLock().lock();
     StringBuffer sb = new StringBuffer(config.getPrefix()).append(config.getSplitString()).append(time).append(config.getSplitString()).append(value.getAndIncrement());
    lock.readLock().unlock();
    return sb.toString();
  }
  
  @Override
  public void run() {
    while (true){
      try {
        Thread.sleep(1000 * config.getRollingInterval());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      String now = DefaultIdGenerator.FORMATTER.format(new Date());
      if (!now.equals(time)){
        lock.writeLock().lock();
        time = now;
        value.set(config.getInitial());
        lock.writeLock().unlock();
      }
    }
  }
  public static void main(String []d){
	  class Test2 implements Runnable{

			DefaultIdGenerator idGenerator;
			Set<String> idSet;
			public Test2(DefaultIdGenerator idGenerator,Set<String> idSet){
				this.idGenerator=idGenerator;
				this.idSet=idSet;
			}
			@Override
			public void run() {
				 String val = idGenerator.next();
 				 System.out.println(val);
			        if (idSet.contains(val)){
			          System.out.println("重复了: " + val);
			        }else{
			          idSet.add(val);
			        }
				
			}

		}
//	    IdGeneratorConfig config = new DefaultIdGeneratorConfig() {
//	      @Override
//	      public String getSplitString() {
//	        return "-";
//	      }
//	      @Override
//	      public int getInitial() {
//	        return 1000000;
//	      }
//	      @Override
//	      public String getPrefix() {
//	        return "NODE01";
//	      }
//	    };
//     IdGeneratorConfig config = new DefaultIdGeneratorConfig(){
//    	 @Override
//	      public String getPrefix() {
//	        return "pc";
//	      }
//     };
     
	  DefaultIdGenerator idGenerator=new DefaultIdGenerator();
 
//    //多线程测试
    System.out.println("--------多线程测试不重复------------------");
    Set<String> idSet = Collections.synchronizedSet(new HashSet());
    ExecutorService es = Executors.newFixedThreadPool(100);
    Test2 t=new Test2(idGenerator,idSet);
    for (int i=0; i<2000000; i++){
    	es.submit(t);
    }
    es.shutdown();
    System.out.println("启用顺序关闭");
    while(true){  
            if(es.isTerminated()){
                System.out.println("所有的子线程都结束了！");  
                break;
            }
            try {
            	System.out.println("子线程的任务还没运行完");
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
        }  
    System.out.println("共生成: " + idSet.size() + "个"+idSet.iterator().next());
	  }


  
  
}
