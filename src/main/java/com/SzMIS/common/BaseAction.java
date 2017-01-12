package com.SzMIS.common;

import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.SzMIS.common.bean.ResponseData;
import com.SzMIS.common.utlt.CommonUtil;
import com.SzMIS.common.utlt.TimeUtil;
import com.SzMIS.sys.user.pojo.UserLogVo;
 
   

 

 

public class BaseAction {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	/** 请求参数 */
	private HashMap<String, String> params = null;
	@Autowired
	public HttpServletRequest request;
 
	public BaseAction() {
		super();
		clearParams();
	}

	protected String redirectTo( String url ) {
		StringBuffer rto = new StringBuffer("redirect:");
		rto.append(url);
		return rto.toString();
	}
	/**
	 * 组装参数
	 * @param key
	 */
	public void setParam(String key){
		get(key);
	}
	
	/**
	 * 组装参数
	 * @param key
	 * @param value
	 */
	public void setParam(String key,String value){
		if(null == params){
			params = new HashMap<String, String>();
		}
		params.put(key, value);
	}
	
	/**
	 * 获取参数值
	 * @param key
	 * @return
	 */
	private String get(String key){
		String value = request.getParameter(key);
		if(null == value){
			value = "";
		}
		setParam(key, value);
		return value;
	}
	
	/**
	 * 获取参数值
	 * @param key
	 * @return
	 */
	public String getParam(String key){
		String value = null;
		if(!CommonUtil.isNullMap(params)){
			value = params.get(key);
		}
		if(StringUtils.isEmpty(value)){
			value = get(key);
		}
		return value;
	}
	
	/**
	 * 清空参数
	 */
	public void clearParams(){
		if(!CommonUtil.isNullMap(params)){
			params.clear();
			params = null;
		}
	}

	/**
	 * 获取参数
	 * @return
	 */
	public HashMap<String, String> getParams() {
		return params;
	}
	
	/**
	 * 设置所有参数 不建议使用
	 */
	@SuppressWarnings({ "rawtypes" })
	public void setAllParam(){
		Enumeration enumer = request.getParameterNames();
		if(null != enumer){
			while(enumer.hasMoreElements()){  
				String key = (String)enumer.nextElement();
				String value = request.getParameter(key);
				setParam(key, value);
			}
		}
	}
	
	/**
	 * 获取用户信息
	 * @return
	 * @throws Exception 
	 */
	public UserLogVo getsessionUser() throws Exception{
		return (UserLogVo)request.getSession().getAttribute("user");
		//return userDaoImpl.getUserInfo(params);
	}
	/***
	 *  得到项目的完整URL
	 * @param request
	 * @return
	 */
	protected String getProjectURL(){
		String url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
		return url;
	}
	/**
	 * 获取响应
	 * @param <T>
	 * @return
	 */
	public <T> ResponseData<T> getResponseData(){
		ResponseData<T> responseData = new ResponseData<T>();
		responseData.setSuccess(false);
		responseData.setData(null);
		responseData.setMessage(null);
		responseData.setResponseTime(TimeUtil.getTimeToString());
		return responseData;
	}
	
	/***
	 * 返回IP地址
	 * **/
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip.equals("0:0:0:0:0:0:0:1")) {
			ip = "本地";
		}
		return ip;
	}
	
}
