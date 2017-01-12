package com.SzMIS.sms.custom.service.imp;

 
 

 

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

import com.SzMIS.sms.custom.dao.ISmsCustomDao;
import com.SzMIS.sms.custom.service.ISmsCustomService;
 

 
 
/***
 * 用户管理相关的服务接口  
 * 其中还包括账号与子系统账号的同步创建.
 * niuchen
 * 2016-9-8
  * ***/
@Service("SmsCustomServiceImp")
public class SmsCustomServiceImp     implements ISmsCustomService{
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
	 	 @Resource(name="ISmsCustomDao")
	 	ISmsCustomDao ismscustomdao;
	 
	 
		
	
 }
