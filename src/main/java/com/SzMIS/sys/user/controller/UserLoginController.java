package com.SzMIS.sys.user.controller;

 
 

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.SzMIS.common.BaseAction;
import com.SzMIS.sys.user.pojo.EaysUiTreepojo;
import com.SzMIS.sys.user.pojo.UserLogVo;
import com.SzMIS.sys.user.service.IuserLoginService;
 
 
@Controller
//@RequestMapping("/userlogincontroller")
public class UserLoginController extends BaseAction{
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name="UserLogServiceImp")
	private IuserLoginService userlogserviceimp;
	/**
	 * 登录 （注解跳过权限验证）
	 */

	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response) {
   			return "index";
 	}
	@ResponseBody
	@RequestMapping("/logoutAction")
	public Map logoutAction(HttpServletRequest request,HttpServletResponse response) {
   		Map m=new HashMap();
   		request.getSession().setAttribute("user",null);
    		m.put("success", true);
   		System.out.println(m);
		return m;
 	}
	
 	/**
	 * 功能: 登陆
	 * 返回: 
	 *  http://127.0.0.1:8088/szwq_sys/enterprisescontroller/getALLEnterprises.action	
	 * **/
 	@ResponseBody
	@RequestMapping("/Userlogin")
	Map Userlog(String username,String userpwd,HttpServletRequest request,HttpServletResponse response,Model model){
 		Map<String,Object> map=new HashMap<String,Object>();
 		try {
 			System.out.println(username);	 System.out.println(username) ;
		 	if("1".equals(username)&&"1".equals(userpwd)){
		 		 map.put("success", true);
		 		UserLogVo tm=new UserLogVo();
	 			tm.setV_login_name(username);
	 			tm.setV_login_password(userpwd);
	 			tm.setV_real_name("张三");
	 			tm.setI_user_id((long) 1);
	 		//	tm.set("2014-11-11");
	 			tm.setMaxlogdate("2016-12-12 11:11");
	 			tm.setMaxlogip(this.getIpAddr(request));
	 			tm.setIp(this.getIpAddr(request));
	 			request.getSession().setAttribute("user",tm);
		 	}else{
		 		 map.put("msg", "账号密码错误");
		 		 map.put("success", false);
  		 	}
		} catch (Exception e) {
		 e.printStackTrace();
		}
		return map;
 	}
	 
	@RequestMapping("/main")
	public String main(HttpServletRequest request,HttpServletResponse response) {
		return "main";
	}
	
	 /**
	  * 返回登陆后布局页面的JSP页面
	  * **/
	@RequestMapping("/Layout")
	ModelAndView Layout(String type,HttpServletRequest request,HttpServletResponse response,Model model){
 		Map<String,Object> map=new HashMap<String,Object>();
 		if("layout_north".equals(type)){
   			 return  new ModelAndView("page/layout/north");
 		}else if("layout_menu".equals(type)){
    			 return  new ModelAndView("page/layout/menu");
 		}else if("layout_center".equals(type)){
   			 return  new ModelAndView("page/layout/center");
 		}else if("layout_south".equals(type)){
   			 return  new ModelAndView("page/layout/south");
 		}else{
 			return null;
 			//return new ModelAndView("example");
 		}
 	}
	
	
	
	/**
	 * 查询模块
	 * */
		@ResponseBody
		@RequestMapping("/sysmoduletree")
		List<EaysUiTreepojo>  sysmoduletree(String susername,String suserpwd,HttpServletRequest request,HttpServletResponse response,Model model){
	  		try {
	 			List<EaysUiTreepojo>  list=	userlogserviceimp.sysmoduletree();
	 			return list;
	 		}catch(Exception e){
	 			e.printStackTrace();
	 		}
	 		return null;
		}
		
		
	
   }
