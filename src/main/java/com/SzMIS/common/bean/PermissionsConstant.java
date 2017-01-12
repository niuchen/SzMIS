package com.SzMIS.common.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 设置权限的常量字符串对象。   防止以后更新名称。
 * */
public class PermissionsConstant {
	public	static final Map<Integer,String> level=new HashMap<Integer,String>(){{    
 		put(1,"全部级别的人员数据");
 		put(2,"本机级别人员数据");
 		put(3,"下级级别人员数据");
 		put(4,"上级级别人员数据");
 		put(5,"本机构及下级级别人员数据");
 		put(6,"本机构及上级级别人员数据");
 		put(7,"上级和下级级别与人员数据");
 		put(8,"自定义级别人员数据");
 		put(9,"全部不能访问");
  	}};
    
  	public static final Map<Integer,String> department=new HashMap<Integer,String>(){{    
 		put(1,"全部部门人员数据");
 		put(2,"本机部门人员数据");
 		put(3,"下级部门人员数据");
 		put(4,"上级部门人员数据");
 		put(5,"本机构及下级部门人员数据");
 		put(6,"本机构及上级部门人员数据");
 		put(7,"上级和下级部门与人员数据");
 		put(8,"自定义部门人员数据");
 		put(9,"全部不能访问");
  	}};
 	
 
	 
 
 
    
 }

