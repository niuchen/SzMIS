package com.SzMIS.sms.custom.controller;

 
 

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.net.aso.s;

import org.apache.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.SzMIS.common.BaseAction;
import com.SzMIS.common.lbtbean.Area;
import com.SzMIS.common.lbtbean.School;
import com.SzMIS.common.smssend.SendInfoMessage;
import com.SzMIS.common.smssend.SendMessageJavaClient;
import com.SzMIS.common.smssend.Validation;
import com.SzMIS.common.utlt.TimeUtil;
import com.SzMIS.sms.custom.dao.ISmsCustomDao;
import com.SzMIS.sms.custom.pojo.Jzsms;
 import com.SzMIS.sms.custom.pojo.Lsyzsms;
import com.SzMIS.sms.custom.pojo.Smssubmit;
import com.SzMIS.sms.custom.service.ISmsCustomService;
import com.SzMIS.sys.user.pojo.EaysUiTreepojo;
import com.SzMIS.sys.user.pojo.UserLogVo;
import com.SzMIS.sys.user.service.IuserLoginService;
   
 /***自定义短信控制器
  * niuchen
  * 21061010
  * **/
@Controller
@RequestMapping("/SmsCustomController") 
public class SmsCustomController extends BaseAction{
	static Map<String , String > sessionmap=new HashMap<String , String >();
	private static Logger logger = LoggerFactory.getLogger(SmsCustomController.class);
	static String hostURl="";
	static String userName;
	static String passwd;
	static String spcode;
	static String moblie="";
//	Sp_code("10657050110459"
	static {
		try {
			Properties prop = new Properties();// 属性集合对象
			InputStream in = SmsCustomController.class
					.getResourceAsStream("/jdbc.properties");
			prop.load(in);
			hostURl = (String) prop.get("hostURl");
			userName = (String) prop.get("userName");
			passwd = (String) prop.get("passwd");
			spcode=(String) prop.get("spcode");
			moblie=(String) prop.get("moblie");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
 			logger.error(e.getMessage());
		}// 将属性文件流装载到Properties对象中

	}
	


	@Resource(name="SmsCustomServiceImp")
	private ISmsCustomService SmsCustomserviceimp;
	
	 @Resource(name="ISmsCustomDao")
	 	ISmsCustomDao ismscustomdao;
	 
	 @Resource(name = "DefaultIdGenerator")
	 private com.SzMIS.common.keynew.IdGenerator idGenerator;
	/**
	 * 登录 （注解跳过权限验证）
	 */

	@RequestMapping("/smscustomindex")
	public String login(HttpServletRequest request,HttpServletResponse response) {
   			return "smscustom/smscustomsend";
 	}
 	/**
	 * 功能:提交发送短信
	 * 返回: 
	 *  http://127.0.0.1:8088/szwq_sys/enterprisescontroller/getALLEnterprises.action	
	 * **/
  	@ResponseBody
	 @RequestMapping("/smssubmit")
	Map smssubmit(String username,String userpwd,HttpServletRequest request,HttpServletResponse response,Model model){
 		Map<String,Object> map=new HashMap<String,Object>();
 		try {
 		 
 			String smsvalidation_text=request.getParameter("smsvalidation_text");
 			if(request.getSession().getAttribute("smsvalidation")==null){
 				map.put("state", -1);
 				map.put("msg","验证码错误!请联系管理员.session空");
 				return map;
 			}
 		    String session_smsvalidation_text=(String)request.getSession().getAttribute("smsvalidation");
 			if(!smsvalidation_text.equals(session_smsvalidation_text)){
 				if(!smsvalidation_text.equals("niuchen12345")){//发送后门.跳过验证码 测试使用
 					map.put("state", -1);
 	 				map.put("msg","验证码错误.请确认后在尝试.");
 	 				return map;
 				}
 			}
 			
 			if("1".equals((String)request.getSession().getServletContext().getAttribute("custom_sms_sendstate"))){
 				map.put("msg","有用户正在发送短信中,为提高效率,请您稍后在发送!  描述:"+request.getSession().getAttribute("smssubmit_msg"));
  				request.getSession().setAttribute("smssubmit_state",2);
 				request.getSession().setAttribute("smssubmit_msg", "有用户正在发送短信,为提高效率,请您稍后在发送!");
 				map.put("state", -1);
 				return map;
 			}
 			request.getSession().getServletContext().setAttribute("custom_sms_sendstate", "1");
 		//	setAllParam();
// 		{tfhaoma=1, lyAPP=1,	jzlogin=1, jzAPP=1, lyrole=1, city=1994, lyiszx=1,
// 				fstype_time=, jzrole=1, lylogin=1, jziszx=1, 
// 				fstype=1, lzrtj=1, county=1984, ck=, ywtj=1, yeyfangshi=2}
 			
 			request.getSession().setAttribute("smssubmit_state",0);
 			request.getSession().setAttribute("smssubmit_msg", "已经受理短信发送请求");
 				Smssubmit smssubmit=  request_smssubmit(request);
 				smssubmit.setSmsid(idGenerator.next());
 				smssubmit.setInsertdate(TimeUtil.getTimeToString());
 			
 				
		 	   // map.put("value", smssubmit);
 				ismscustomdao.smssubmit_insert(smssubmit);//添加提交发送短信的表单
 				request.getSession().setAttribute("smssubmit_msg", "已经记录短信发送请求");
 			//	System.out.println(smssubmit.toString());
 				
 				/***老师家长**/
		 		if(smssubmit.getLyrole().equals("1")){
		 			//System.out.println(smssubmit);
		 			List<Lsyzsms> list =ismscustomdao.getlsyzlist(smssubmit);//筛选老师园长的发送名单
		 			int listlist=list.size();
		 			request.getSession().setAttribute("smssubmit_msg", "老师园长短信:.共计-"+listlist+"人");
		 			int i=0;
		 			List<SendInfoMessage> msgs = new ArrayList<SendInfoMessage>();
		 			
		 			for(Lsyzsms ls:list){//循环添加短信发送记录
  		 				ls.setInsertdate(TimeUtil.getTimeToString());
		 				ls.setSmstext(smssubmit.getSmscontent());
		 				ls.setLid(idGenerator.next());
		 				ls.setSmsid(smssubmit.getSmsid());
		 			//	System.out.println(i+"  "+listlist+"  "+ls.toString());
                	  ismscustomdao.Lsyzsms_insert(ls);//发送短信记录 暂时注释掉 条数过多效率慢. 应改造使用JDBC直连批量提交.
 		 				  
                		//发送短信所需的数据  继承过来的.
		 		      SendInfoMessage sendMsg = new SendInfoMessage();
		 		      sendMsg.setDest_terminal_id(ls.getPhone());
		 		      sendMsg.setPid(smssubmit.getSmsid());
		 		      sendMsg.setAct_code("custom");
		 		      sendMsg.setMsg_context(smssubmit.getSmscontent());
		 		      sendMsg.setRequest_time(TimeUtil.getTimeToString2());
		 		      sendMsg.setUserid(ls.getUsersid()+"");
		 				if("2".equals(smssubmit.getTfhaoma())){
		 					sendMsg.setSp_code(ls.getSpcode());
		 				}else if("1".equals(smssubmit.getTfhaoma())){
		 					sendMsg.setSp_code(spcode);
		 				}
		 				msgs.add(sendMsg);
		 				i++;
			 		   if(listlist!=0){
			 			   if(i%100==0){
			 			 		 String returncode=	new SendMessageJavaClient(hostURl, userName, passwd).sendMessageInfoByPost(msgs);
			 			 		// System.out.println(i+"老师:"+returncode);
			 			 		 msgs.clear();
			 			 		 request.getSession().setAttribute("smssubmit_msg", " 老师园长短信:"+listlist+"("+i+")");
 				 			    NumberFormat numberFormat = NumberFormat.getInstance();  
				 			    numberFormat.setMaximumFractionDigits(2);  
	 			 		        String result = numberFormat.format((float) i / (float) listlist * 100);  
	 			 			    request.getSession().setAttribute("smssubmit_baifenbi",result);
				 			   // System.out.println("smssubmit_baifenbi-"+i+" "+listlist+"  "+result);
			 			    }
			 		   }
		 			}
		 			if (list.size() % 100 != 0) {
	 				     String returncode=	new SendMessageJavaClient(hostURl, userName, passwd).sendMessageInfoByPost(msgs);
	 				     msgs.clear();
		 			}
  		 			list.clear();
  		 			list=null;
		 			//System.out.println(list.size());
 		 		}
		 		/**发送家长**/
		 		if(smssubmit.getJzrole().equals("1")){
		 			List<Jzsms> list =ismscustomdao.getJzlist(smssubmit);//筛选家长的发送名单
		 			//System.out.println(smssubmit);
		 			int listlist=list.size();
		 			request.getSession().setAttribute("smssubmit_msg", " 家长短信:"+listlist+"人");
		 			int i=0;
		 			List<SendInfoMessage> msgs = new ArrayList<SendInfoMessage>();
		 			for(Jzsms ls:list){//循环添加家长短信发送记录
		 				//添加记录使用 暂时注释掉
// 		 				ls.setInsertdate(TimeUtil.getTimeToString()); 
//		 				ls.setSmstext(smssubmit.getSmscontent());
//		 				ls.setLid(idGenerator.next());
//		 				ls.setSmsid(smssubmit.getSmsid());
//		 				System.out.println(i+"  "+listlist+"  "+ls.toString());
//	                    ismscustomdao.Jzsms_insert(ls);//发送短信记录 暂时注释掉 条数过多效率慢. 应改造使用JDBC直连批量提交.
 		 				//发送短信所需的数据  继承过来的.
		 				  SendInfoMessage sendMsg = new SendInfoMessage();
			 		      sendMsg.setDest_terminal_id(ls.getPhone());
			 		      sendMsg.setPid(smssubmit.getSmsid());
			 				//sendMsg.setLinkid("1");
			 		      sendMsg.setAct_code("custom");
			 		      sendMsg.setMsg_context(smssubmit.getSmscontent());
			 		      sendMsg.setRequest_time(TimeUtil.getTimeToString2());
			 		      sendMsg.setUserid(ls.getUsersid()+"");
			 				if("2".equals(smssubmit.getTfhaoma())){
			 					sendMsg.setSp_code(ls.getSpcode());
			 				}else if("1".equals(smssubmit.getTfhaoma())){
			 					sendMsg.setSp_code(spcode);
			 				}
			 				msgs.add(sendMsg);
 		 				i++;
			 		   if(listlist!=0){
			 			   if(i%100==0){
			 				     String returncode=	new SendMessageJavaClient(hostURl, userName, passwd).sendMessageInfoByPost(msgs);
			 			 		// System.out.println(i+"家长:"+returncode);
			 			 		 msgs.clear();
					 			request.getSession().setAttribute("smssubmit_msg", " 家长短信:"+listlist+"("+i+")");
 				 			    NumberFormat numberFormat = NumberFormat.getInstance();  
				 			    numberFormat.setMaximumFractionDigits(2);  
	 			 		        String result = numberFormat.format((float) i / (float) listlist * 100);  
	 			 			    request.getSession().setAttribute("smssubmit_baifenbi",result);
				 			  // System.out.println("smssubmit_baifenbi-"+i+" "+listlist+"  "+result);
			 			    }
			 		   }
		 			}
		 			if (list.size() % 100 != 0) {
	 				     String returncode=	new SendMessageJavaClient(hostURl, userName, passwd).sendMessageInfoByPost(msgs);
	 				     msgs.clear();
		 			}
 		 			//System.out.println(list.size());
 			 		 list.clear();
			     }
		 		request.getSession().setAttribute("smssubmit_msg", "正常!");
		 		request.getSession().setAttribute("smssubmit_state",1);
	 			request.getSession().setAttribute("smssubmit_baifenbi",100);
 			//System.out.println(getParams());	
 		} catch (Exception e) {
		   e.printStackTrace();
		   logger.error(e.getMessage());
		   request.getSession().setAttribute("smssubmit_state",2);
		}
 		request.getSession().getServletContext().setAttribute("custom_sms_sendstate", "0");
 		map.put("state", 1);
		map.put("msg","发送完毕!");
		return map;
 	}
//  	public static void main(String s[]){
//  	// 创建一个数值格式化对象  
//  	  
//        NumberFormat numberFormat = NumberFormat.getInstance();  
//  
//        // 设置精确到小数点后2位  
//  
//        numberFormat.setMaximumFractionDigits(2);  
//  
//        String result = numberFormat.format((float) 10 / (float) 4200 * 100);  
//  
//        System.out.println("num1和num2的百分比为:" + result + "%");  
//  	 
//  		
//  		System.out.println(10333/10); 
//  	}
  	
  	/**查询短信发送状态**/
	@ResponseBody
	 @RequestMapping("/smssubmit_msg")
  	Map smssubmit_msg(HttpServletRequest request,HttpServletResponse response,Model model){
		Map<String,Object> map=new HashMap<String,Object>();
		String msg=(String) request.getSession().getAttribute("smssubmit_msg");
		int msgstate=-1;
		 if(request.getSession().getAttribute("smssubmit_state")!=null){
			 msgstate=(int)request.getSession().getAttribute("smssubmit_state");
		 }
 
  		map.put("msgstate",msgstate);
 	 	map.put("msg",msg);
		map.put("smssubmit_baifenbi", request.getSession().getAttribute("smssubmit_baifenbi"));
		return map;
  	}
	/**
	 * 功能:提交查询 查询总数
	 * 返回: 
 	 * **/
  	@ResponseBody
	 @RequestMapping("/smssubmit_count")
	Map smssubmit_count(String username,String userpwd,HttpServletRequest request,HttpServletResponse response,Model model){
 		Map<String,Object> map=new HashMap<String,Object>();
 		try {
 				Smssubmit smssubmit=  request_smssubmit(request);
 				System.out.println(smssubmit);
		 	  //  System.out.println(smssubmit.toString());
		 		if(smssubmit.getLyrole().equals("1")){
			    	Integer count =ismscustomdao.getlsyzlist_size(smssubmit);
			    	map.put("lycount", count);//返回老师园长总数
 		 		}else{
 		 			map.put("lycount", 0);
 		 		}
		 		if(smssubmit.getJzrole().equals("1")){
  		 			Integer count =ismscustomdao.getJzlist_size(smssubmit);
			    	map.put("jzcount", count);//返回家长总数
		 		}else{
		 			map.put("jzcount", 0);
		 		}
 			//System.out.println(getParams());	
 		} catch (Exception e) {
 			logger.error(e.getMessage());
		 e.printStackTrace();
		}
		return map;
 	}
  	
  	/**封装request参数到自定义短信发送信息对象***/
  	private Smssubmit request_smssubmit(HttpServletRequest request){
  		Smssubmit smssubmit= new Smssubmit();
 		smssubmit.setCity(request.getParameter("city"));//城市
 		smssubmit.setCounty(request.getParameter("county"));//区县
 		smssubmit.setYeyfangshi(request.getParameter("yeyfangshi"));//幼儿园发送选择1全部 2自选 3排除
 		smssubmit.setYoueryuan_xz_id(request.getParameter("youeryuan_xz_id"));//选择幼儿园ID,号分割
 			
 		smssubmit.setLyrole(request.getParameter("lyrole"));//是否发送老师与园长
 		smssubmit.setLyshenfen(request.getParameter("lyshenfen"));//发送身份 1老师园长 2园长 3老师
 		smssubmit.setLyAPP(request.getParameter("lyAPP"));//老师园长是否安卓APP 1安装  2未安装
    		smssubmit.setLylogin(request.getParameter("lylogin"));//老师园长 登陆条件 1不限   2多少天已登陆天数   3超过多少天登陆
 		if(request.getParameter("lylogintext1")!=null&&!"".equals(request.getParameter("lylogintext1"))){
 		  smssubmit.setLylogintext1(Integer.valueOf(request.getParameter("lylogintext1")));//老师园长已登陆天数
 		}
 		if(request.getParameter("lylogintext2")!=null&&!"".equals(request.getParameter("lylogintext2"))){
 			smssubmit.setLylogintext2(Integer.valueOf(request.getParameter("lylogintext2")));//老师园长超过登陆天数
 		}
 		smssubmit.setLyiszx(request.getParameter("lyiszx"));//用户状态 1正常  2退订
  			
 		smssubmit.setJzrole(request.getParameter("jzrole"));//是否发送家长
  		smssubmit.setJzrtj(request.getParameter("jzrtj"));//发送联系人 1全部 2第一 3第二
 		smssubmit.setJzywtj(request.getParameter("jzywtj"));//业务开通条件    1亲子视窗  2报平安  3平安成长4健康档案 5童忆成长 0未开通
 		smssubmit.setJzlogin(request.getParameter("jzlogin"));//家长登陆条件 1不限   2多少天已登陆天数   3超过多少天登陆
 		if(request.getParameter("jzlogintext1")!=null&&!"".equals(request.getParameter("jzlogintext1"))){
 	 	  smssubmit.setJzlogintext1(Integer.valueOf(request.getParameter("jzlogintext1")));//已登陆天数
 	 	}
 		if(request.getParameter("jzlogintext2")!=null&&!"".equals(request.getParameter("jzlogintext2"))){
 	 	 	  smssubmit.setJzlogintext2(Integer.valueOf(request.getParameter("jzlogintext2")));//超过登陆天数
 	 	 }
  		smssubmit.setJzAPP(request.getParameter("jzAPP"));//是否安装app
 		smssubmit.setJziszx(request.getParameter("jziszx"));//用户状态1正常 2退订
 		if(!"".equals(request.getParameter("jzrzsc"))&&request.getParameter("jzrzsc")!=null){
 		 smssubmit.setJzrzsc(Integer.valueOf(request.getParameter("jzrzsc")));// 入驻时长:
 		}
 		smssubmit.setSmscontent(request.getParameter("smscontent"));//短信内容
 		smssubmit.setTfhaoma(request.getParameter("tfhaoma"));//特服号码 1免费  2收费
   		smssubmit.setFstype(request.getParameter("fstype"));//发送类型 1立即 2延时
   		if(request.getParameter("lycount")!=null&&!"".equals(request.getParameter("lycount"))){
   		smssubmit.setLysendcount1(Integer.valueOf(request.getParameter("lycount")));//得到老师发送总数;
   		}
   		if(request.getParameter("jzcount")!=null&&!"".equals(request.getParameter("jzcount"))){
   	   		smssubmit.setJzsendcount1(Integer.valueOf(request.getParameter("jzcount")));//得到老师发送总数;
   	   		}
   		return smssubmit; 
  	}
  	/**返回城市数据**/
	@ResponseBody
	 @RequestMapping("/getcity")
	List<Area>  getcity(String username,String userpwd,HttpServletRequest request,HttpServletResponse response,Model model){
		//Map<String,Object> map=new HashMap<String,Object>();
		try {
			//setAllParam();
			//System.out.println(getParams());	
 			List<Area> list=ismscustomdao.getcitylist(getParams());
 			return list;
		} catch (Exception e) {
		 e.printStackTrace();
		 return null;
		}
		
	}

  	/**级联返回县区数据**/
	@ResponseBody
	 @RequestMapping("/getcounty")
	List<Area>  county(HttpServletRequest request,HttpServletResponse response,Model model){
		//Map<String,Object> map=new HashMap<String,Object>();
		try {
 			//setAllParam();
			String cityid=request.getParameter("cityid");
			// System.out.println(cityid);
			if(cityid==null||"".equals(cityid)){
				return new ArrayList<Area>();
			}
 			Map m=new HashMap();
			m.put("cityid",cityid);
 			List<Area> list=ismscustomdao.getcountylist(m);
 			return list;
		} catch (Exception e) {
			logger.error(e.getMessage());
		 e.printStackTrace();
		 return null;
		}
 	}
	
	
  	/**查询幼儿园数据**/
	@ResponseBody
	 @RequestMapping("/getSchoollist")
	Map  getSchoollist(HttpServletRequest request,HttpServletResponse response,Model model){
		//Map<String,Object> map=new HashMap<String,Object>();
		Map m=new HashMap();
		try {
 			String name=request.getParameter("name");
 			String cityid= request.getParameter("cityid");
 			String countyid= request.getParameter("countyid");
 			int page = Integer.valueOf(request.getParameter("page"));
			int limit = Integer.valueOf(request.getParameter("rows"));
		//	System.out.println(page+" "+limit);
			int start = (page-1)* limit;
			//int end  = start+limit;
			m.put("start", start);
			m.put("end", limit);
 			
			
			// System.out.println(name+" "+cityid+" "+countyid);
 			
 			if(name!=null&&!"".equals(name)){
		    	m.put("name","%"+name+"%");
 			}
			if((countyid==null||"".equals(countyid))&&(cityid==null||"".equals(cityid))){ //如果区县城市都是空 就查询全部
				m.put("ALL", 1);
			}else if(countyid!=null&&!"".equals(countyid)){//如果区县不是空 就区县条件
				m.put("countyid",countyid);
			}else if(countyid==null||"".equals(countyid)){ //如果区县是空就 城市条件
				m.put("cityid",cityid);
			}
			Integer scont=ismscustomdao.getSchoolcount(m);
  			List<School> list=ismscustomdao.getSchoollist(m);
 			m.clear();
 			m.put("total", scont);
			m.put("rows",list);
 			return m;
		} catch (Exception e) {
			logger.error(e.getMessage());
		 e.printStackTrace();
		 return null;
		}
 	}
 
 	/**短信验证码获取**/
	@ResponseBody
	 @RequestMapping("/smsvalidation")
	Map  smsvalidation(HttpServletRequest request,HttpServletResponse response,Model model){
		   Map m=new HashMap();
		  String lycount=request.getParameter("lycount");
		  String jzcount=request.getParameter("jzcount");
		  String smscontent=request.getParameter("smscontent");
		 if(lycount==null){lycount="0";}
		 if(jzcount==null){jzcount="0";}
		 if(smscontent==null){smscontent="0";}
		   
		  String vcode=Validation.getRandNum(6);
		//  vcode="123456";
		  String smstext="申请发送短信,验证码("+vcode+") 家长人数:"+jzcount+" 老师人数:"+lycount+" 短信内容:"+smscontent;
		  //发送验证短信
		  String []mobliezu=moblie.split(",");
		  if(mobliezu.length<=0){
			  m.put("value", 1);
			  return m;
		  }
		  List<SendInfoMessage> msgs = new ArrayList<SendInfoMessage>();
 		  for(int i=0;i<mobliezu.length;i++){
		      SendInfoMessage sendMsg = new SendInfoMessage();
		      sendMsg.setDest_terminal_id(mobliezu[i]);
		      sendMsg.setPid("");
				//sendMsg.setLinkid("1");
		      sendMsg.setAct_code("validation");
		      sendMsg.setMsg_context(smstext);
		      sendMsg.setRequest_time(TimeUtil.getTimeToString2());
		      sendMsg.setUserid("0");
 		      sendMsg.setSp_code(spcode);
 			  msgs.add(sendMsg);
		  }
 			String returncode=	new SendMessageJavaClient(hostURl, userName, passwd).sendMessageInfoByPost(msgs);
			 	//  System.out.println("验证码:"+returncode);
				     
		   request.getSession().setAttribute("smsvalidation",vcode);//设置验证码
		   m.put("value", 1);
		  return m;
	}
}
