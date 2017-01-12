package com.SzMIS.sys.user.service.imp;

 
 

 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;

import com.SzMIS.sys.user.dao.IUserLoginDao;
import com.SzMIS.sys.user.pojo.EaysUiTreepojo;
import com.SzMIS.sys.user.service.IuserLoginService;

 
 
/***
 * 用户管理相关的服务接口  
 * 其中还包括账号与子系统账号的同步创建.
 * niuchen
 * 2016-9-8
  * ***/
@Service("UserLogServiceImp")
public class UserLoginServiceImp     implements IuserLoginService{
	protected Logger logger = LoggerFactory.getLogger(this.getClass());


	@Resource(name = "sqlSessionFactory")
	public SqlSessionFactory sf;
	
 	@Resource(name = "transactionManager") 
 	public DataSourceTransactionManager txManager;
	
// 	   @Resource(name="DefaultIdGenerator")
// 	  public	IdGenerator idGenerator;
//	 	public void setIdGenerator(IdGenerator idGenerator) {
//	 		this.idGenerator = idGenerator;
//	 	}
	 	 @Resource(name="IUserLoginDao")
	 	IUserLoginDao iuserlogindao;
	 
		@Override
		public List<EaysUiTreepojo> sysmoduletree() {
			Map<String, Object> m=new HashMap<String, Object>();
			m.put("i_del_tag",2);
//  		    List<T_MODULES> list=	iuserlogindao.sysmoduletree(m);
//  		    List<EaysUiTreepojo> eaylist=new ArrayList<EaysUiTreepojo>();
// 			for(T_MODULES tm:list){
//				EaysUiTreepojo ep=new EaysUiTreepojo();
//				ep.setId(tm.getM_id()+"");
//				ep.setText(tm.getM_name());
//				ep.setParent_id(tm.getM_parent_id()+"");
//			    Map<String,String> attrebutes = new HashMap<String,String>();
//				attrebutes.put("url", tm.getM_file_path());
// 			    ep.setAttributes(attrebutes) ;
//				ep.setIconCls(tm.getM_iconcls());
//	//			System.out.println(ep.getText());
//				eaylist.add(ep);
// 			}
// 			// 		   // ep.setState("closed");
 	  	     
 			List<EaysUiTreepojo> elist=new ArrayList<EaysUiTreepojo>();
  		     EaysUiTreepojo e=new EaysUiTreepojo();
			e.setId("0");
 			e.setText("功能");
 		
 			List<EaysUiTreepojo> userelist=new ArrayList<EaysUiTreepojo>();
 			EaysUiTreepojo usere=new EaysUiTreepojo(); 
 			usere.setId("1");
 			usere.setText("自定义短信发送");
 			usere.setParent_id("0");
	 			Map<String,String> attrebutes = new HashMap<String,String>();
				attrebutes.put("url", "SmsCustomController/smscustomindex.action");
			usere.setAttributes(attrebutes) ;
			userelist.add(usere);
			
			EaysUiTreepojo usere2=new EaysUiTreepojo(); 
 			usere2.setId("1");
 			usere2.setText("自定义短信发送记录");
 			usere2.setParent_id("0");
	 			Map<String,String> attrebutes2 = new HashMap<String,String>();
				attrebutes2.put("url", "SmsCustomRecordController/smscustomindex.action");
			usere2.setAttributes(attrebutes2) ;
			userelist.add(usere2);
			
 			e.setChildren(userelist);
 			
 			elist.add(e);
			return elist;
		}
	 
		/**
	     *递归树节点下级. 根据根节点找到全部的子节点.
	     *m全部节点的集合
	     *eay根节点对象   会向对象存储下级节点并返回.
	     * **/
		public EaysUiTreepojo	orderTree(List<EaysUiTreepojo> eaylist,EaysUiTreepojo eay){
			//EaysUiTreepojo eay=new EaysUiTreepojo();
			int i=0;
 		 for(EaysUiTreepojo e:eaylist){
  			 if(e.getParent_id().equals(eay.getId())){
 				i++;
 				//System.out.println(e.getParent_id());
 				eay.getChildren().add(e);
 				orderTree(eaylist,e);//递归调用
 			 }
 		 }
			if(i==0){
				//System.out.println(eay.getId()+" 没有找到下级节点..");
				return null;
			}
			//System.out.println(m.get(rootid).getId());
			return eay;
		}
		
		
		
	
 }
