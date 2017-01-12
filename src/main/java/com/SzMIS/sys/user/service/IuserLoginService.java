package com.SzMIS.sys.user.service;

  

 

import java.util.List;
import java.util.Map;

import com.SzMIS.common.bean.OperateState;
import com.SzMIS.common.bean.T_USERS_INFO;
import com.SzMIS.sys.user.pojo.EaysUiTreepojo;
 

public interface IuserLoginService {
 
	/**
	 * 返回系统模块的树结果
	 * **/
	public List<EaysUiTreepojo> sysmoduletree();
	
 
}
