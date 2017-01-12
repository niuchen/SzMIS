package com.SzMIS.common.utlt;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * get current system time
 * @author sunzexing
 */
public class TimeUtil {
	 
	
	/**
	 * 返回当前日期时间 yyyy-MM-dd HH:mm:ss
	 * @return String
	 */
	public static String getTimeToString(){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String times =  sdf.format(date);
		return times;
	}
	
	/**
	 * 返回当前日期时间 yyyyMMddHHmmss
	 * @return String
	 */
	public static String getTimeToString2(){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String times =  sdf.format(date);
		return times;
	}
	
	
	
	
	public static String getParaToString(String date){
		if(date == null || "".equals(date)){
			return "";
		}
		Date d = Date.valueOf(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String times = sdf.format(d);
		return times;
	}
	
	public  static String formatIbatisTime(String time){
		if(time == null || "".equals(time.trim())){
			return "";
		}
		if(time.indexOf(".")  != -1){
			return time.substring(0, time.indexOf("."));
		}else{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String times = "";
			try{
				Date d = Date.valueOf(time);
				times =  sdf.format(d);
			}catch(Exception e){
				return time;
			}
			return times;
		}
	}
	
	public  static String formatSqlTime(String time){
		if(time == null || "".equals(time.trim())){
			return "";
		}else{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String times = "";
			try{
				Date d = Date.valueOf(time);
				times =  sdf.format(d);
			}catch(Exception e){
				return time;
			}
			return times;
		}
	}
	
	public static String addDate(String date,int i,int type) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");  
		Calendar cd = Calendar.getInstance();
		cd.setTime(sdf.parse(date));   
		switch(type){
			case 1 :
				cd.add(Calendar.DATE, i);
				break;
			case 2 :
				cd.add(Calendar.MONTH, i);
				break;
			case 3 :
				cd.add(Calendar.YEAR, i);
				break;
		}
		return sdf.format(cd.getTime());
	}
	/**几天前**/
	public static String getAfterDate(Date date,int days){   
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
	    Calendar calendar = Calendar.getInstance();      
	    calendar.setTime(date);   
	    calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR) + days);   
	    return df.format(calendar.getTime());   
	} 
	/**几天前**/
	public static String getBeforeDate(Date date,int days){   
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
	    Calendar calendar = Calendar.getInstance();      
	    calendar.setTime(date);   
	    calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR) - days);   
	    return df.format(calendar.getTime());   
	}  
	
	public static String splitDate(String time){
		if(null != time && !"".equals(time.trim())){
			time = time.substring(0, 10);
		}
		return time;
	}

	public static String DateToStr(Date date) { 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String str = format.format(date); 
		return str; 
	} 

	public static String formatDateStr(String str) { 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
		java.util.Date date = null; 
		try {  
			date = format.parse(str);
		} catch (ParseException e) { 
			e.printStackTrace(); 
		} 
		Calendar cal= Calendar.getInstance();
		cal.setTime(date);
		int month=cal.get(Calendar.MONTH) + 1;
		int day=cal.get(Calendar.DATE);
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		String[] weekDays = {"(日)", "(一)", "(二)", "(三)", "(四)", "(五)", "(六)"};
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0){
		   w = 0;
		}
		return month+"-"+day+weekDays[w]+hour+":"+minute;
	}
	
	/**
	 * 当前日期是否为周末
	 * @param str
	 * @return
	 */
	public static boolean isWeekend(String str){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = null; 
		try {  
			date = format.parse(str);
		} catch (ParseException e) { 
			e.printStackTrace(); 
		} 
		Calendar cal= Calendar.getInstance();
		cal.setTime(date);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0){
		   w = 0;
		}
		if(w == 0 || w == 6){
			return true;
		}
		return false;
	}
	
	/**
	 * 得到指定月的天数
	 */
	public static int getMonthLastDay(int year, int month){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		//把日期设置为当月第一天
		c.set(Calendar.DATE, 1);
		//日期回滚一天，也就是最后一天
		c.roll(Calendar.DATE, -1);
		int maxDate = c.get(Calendar.DATE);
		return maxDate;
	}

	 /**
    * 获取当前日期是星期几<br>
    * 
    * @param dt
    * @return 当前日期是星期几
    */
   public static String getWeekOfDate(Date dt) {
       String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
       Calendar cal = Calendar.getInstance();
       cal.setTime(dt);

       int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
       if (w < 0)
           w = 0;
        return weekDays[w];
   }
   /**
    * 获取当前日期是星期几<br>
    * 
    * @param dt
    * @return 当前日期1-7
    */
   public static Integer getWeekOfDate2(java.util.Date dt) {
       Integer[] weekDays = {7, 1, 2, 3, 4, 5, 6};
       Calendar cal = Calendar.getInstance();
       cal.setTime(dt);

       int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
       if (w < 0)
           w = 0;
        return weekDays[w];
   }
   /**
    * 根据日期获得所在周的日期 
    * @param mdate
    * @return
    */
   @SuppressWarnings("deprecation")
   public static List<java.util.Date> dateToWeek(java.util.Date mdate) {
       int b = mdate.getDay();
       java.util.Date fdate;
       List<java.util.Date> list = new ArrayList<java.util.Date>();
       Long fTime = mdate.getTime() - b * 24 * 3600000;
       for (int a = 1; a <= 7; a++) {
           fdate = new java.util.Date();
           fdate.setTime(fTime + (a * 24 * 3600000));
           list.add(a-1, fdate);
       }
       return list;
   }
   /**
    * 冒泡排序
    * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
    */
   public static String[] bubbleSort(String[] array) {
       int temp;
       for(int i=0;i<array.length;i++){//趟数
         for(int j=0;j<array.length-i-1;j++){//比较次数
           if(Integer.valueOf(array[j])>Integer.valueOf(array[j+1])){
             temp=Integer.valueOf(array[j]);
             array[j]=array[j+1];
             array[j+1]=temp+"";
           }
         }
       }
       return array;
   }
   
   /**
    * 日期冒泡排序
     */
   public static String[] datebubbleSort(String[] array) {
       String temp;
       try {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		   for(int i=0;i<array.length;i++){//趟数
		     for(int j=0;j<array.length-i-1;j++){//比较次数
 		    	 java.util.Date date = sdf.parse(array[j]);
				java.util.Date date1=sdf.parse(array[j+1]);
		       if(date.compareTo(date1)==1){
		         temp=array[j];
		         array[j]=array[j+1];
		         array[j+1]=temp+"";
		       }
		     }
		   }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
       return array;
   }
	public static void main(String[] args) {
//		
//		 System.out.println(times);
		String[] ps={"2015-2-13","2015-12-11","2016-2-11","2015-4-11","2012-2-11"};
	//	java.util.Date parse = DateFormat.parse("2015-2-2") ;
		//java.util.Date date = new java.util.Date("2015-2-2");
		//java.util.Date date2 = new java.util.Date("2015-2-1");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 
		try {
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println(TimeUtil.getAfterDate(currentDate, 10));	
		System.out.println(TimeUtil.getBeforeDate(currentDate, 10));	
			if(1==1)
			return;
			TimeUtil.datebubbleSort(ps);
			java.util.Date date = sdf.parse(ps[0]);
			java.util.Date date1=sdf.parse(ps[1]);
			System.out.println(ps[0]+"  "+ps[1]+"  "+ps[2]+"  "+ps[3]+"  "+ps[4]);
 			//System.out.println(date.compareTo(date1));
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
//		ps=TimeUtil.bubbleSort(ps);
//		  
//		 java.util.Date date = new java.util.Date(System.currentTimeMillis());
//		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		 String times =  sdf.format(date);
//			int d =TimeUtil.getWeekOfDate2(date);//当前星期数 1-7
//			//d=5;
//			int jihua=0;//最近应该执行的星期数
//			//找出当前星期最近应该执行的一个星期数。
//			for(int i=0;i<ps.length;i++){
//				Integer p=Integer.valueOf(ps[i]);
//				if(d<=p){
//					jihua=p;
//					break;
//				}
//			}
//			
//			//如果是0表示没有找到比当前日期星期小的计划星期，如：计划是周二，周6， 当前是周7  那么就要取最小日期周二。
//			if(jihua==0){
//				jihua=Integer.valueOf(ps[0]);
//			}
//			System.out.println("计划周："+jihua+"  当前周："+d);
//			if(jihua==d){
//				System.out.println(times);
//			}
//		   if(jihua>d){
//			    // java.util.Date date = new java.util.Date(System.currentTimeMillis());
//			     Calendar   calendar   =   new   GregorianCalendar(); 
//			     calendar.setTime(date); 
//			     calendar.add(calendar.DATE,jihua-d);//把日期往后增加一天.整数往后推,负数往前移动 
//			     date=  calendar.getTime();   //这个时间就是日期往后推一天的结果 
//			     //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				 times =  sdf.format(date);
//			     System.out.println(times);
//		   }
//		   if(jihua<d){
//			   Calendar   calendar   =   new   GregorianCalendar(); 
//			     calendar.setTime(date); 
//			     calendar.add(calendar.DATE,7-d+jihua);//把日期往后增加一天.整数往后推,负数往前移动 
//			     date=  calendar.getTime();   //这个时间就是日期往后推一天的结果 
//			     //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				 times =  sdf.format(date);
//			     System.out.println(times);
//		   }
		
//		   // 定义输出日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//         
//        java.util.Date currentDate = new java.util.Date(System.currentTimeMillis());
//         
//        // 比如今天是2012-12-25
//        List<java.util.Date> days = dateToWeek(currentDate);
//        System.out.println("今天的日期: " + sdf.format(currentDate));
//        for (java.util.Date date2 : days) {
//            System.out.println(sdf.format(date2));
//        }
		//System.out.println(TimeUtil.getWeekOfDate2(date));
 
	}
	
	/**
	 * 获取两个日期之间相差多少天
	 * 
	 */
	public static int countDays(String begin,String end){
		int days = 0;

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c_b = Calendar.getInstance();
		Calendar c_e = Calendar.getInstance();

		try{
		c_b.setTime(df.parse(begin));
		c_e.setTime(df.parse(end));

		while(c_b.before(c_e)){
		days++;
		c_b.add(Calendar.DAY_OF_YEAR, 1);
		}

		}catch(ParseException pe){
		System.out.println("日期格式必须为：yyyy-MM-dd；如：2010-4-4.");
		}

		return days;
		}
	
	   /**
	    * 相差小时数
	    */
	   public static long countHours(String begin,String end){
		   SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	        long between = 0;
	        try {
	            java.util.Date begin1 = dfs.parse(begin);
	            java.util.Date end1 = dfs.parse(end);
	            between = (end1.getTime() - begin1.getTime());// 得到两者的毫秒数
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        long day = between / (24 * 60 * 60 * 1000);
	        long hour = (between / (60 * 60 * 1000) - day * 24);
		    return hour;
		   
	   }
	
}
