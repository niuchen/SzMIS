package com.SzMIS.common.utlt;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.SzMIS.common.bean.T_USERS_INFO;




public class WebUtil<T> {

	
	/*********
	 * 将 request中的参数转成map
	 * 并添加用户id，用户类型，是否超级管理员，区县id等
	 * @param req
	 * @return
	 */
	public static Map fromRequestToMap (HttpServletRequest req){
		Map map = new HashMap();
		Enumeration enums = req.getParameterNames();
		while(enums.hasMoreElements()){
			String name = (String)enums.nextElement();
			map.put(name, req.getParameter(name));
		}
		T_USERS_INFO users  = WebUtil.getUser(req);
		map.put("i_user_id", users.getI_user_id());
		map.put("i_admin_tag", users.getI_admin_tag());
		

		return map;
	}
	
	
	/**************
	 * 从session中得到用户
	 * @param res
	 * @return
	 */
	public static T_USERS_INFO  getUser(HttpServletRequest res){
		T_USERS_INFO user =  (T_USERS_INFO) res.getSession().getAttribute("user");
		return user;
	}
 
	
	/***************
	 * 判断当前用户是否是超级管理员
	 * @param user
	 * @return
	 */
	public static Boolean  isAdministrator(T_USERS_INFO user){
		
		return null;
	}
	
	
	/******************
	 * 判断是否启用个性化权限设置
	 * @param user
	 * @return
	 */
	public static boolean isPeronPermis(T_USERS_INFO user){
		if(user.getI_is_gxh() != null && 1 == user.getI_is_gxh().intValue()){
			return true;
		}
		return false;
	}
	
	/****************************
	 * 参数编码
	 * @param params
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String decodeParams(String params) throws UnsupportedEncodingException{
		if(params == null || "".equals(params) || 
				"null".equals(params) || "undefined".equals(params)){
			return "";
		}
		String str = java.net.URLDecoder.decode(params,"utf-8");
		return str;
		
	}
	
		

	
	/******
	 * 字符串转数字
	 * @param str
	 * @return
	 */
	public static Integer stringToNumber(String str){
		Integer inte = null;
		if(str != null && !"null".equals(str) && !"".equals(str)){
			inte = Integer.valueOf(str);
		}
		return inte;
	}
	
	/*****
	 * 验证字符串是否为空、null、“”
	 * 不是 返回true
	 * 否则返回false 
	 * @param str
	 * @return
	 */
	public static boolean invalidateString(String str){
		boolean tag = false;
		if(str != null && !"null".equals(str) && !"".equals(str)){
			tag = true;
		}
		return tag;
	}
	
	
	
}
