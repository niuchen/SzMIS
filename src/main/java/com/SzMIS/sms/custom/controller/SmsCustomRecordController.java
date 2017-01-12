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
@RequestMapping("/SmsCustomRecordController") 
public class SmsCustomRecordController extends BaseAction{
	static Map<String , String > sessionmap=new HashMap<String , String >();
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

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
   			return "smscustom/smscustomrecordsend";
 	}
  
	/**查询短信发送记录**/
	@ResponseBody
	 @RequestMapping("/getSmsCustomRecord")
	Map  getSmsCustomRecord(HttpServletRequest request,HttpServletResponse response,Model model){
 		//String is_leaf=request.getParameter("is_leaf");
 
// 		String m_name=request.getParameter("m_name");
// 		String dtm_insert_time1=request.getParameter("dtm_insert_time1");
// 		String dtm_insert_time2=request.getParameter("dtm_insert_time2");
// 		
   	//	System.out.println(dtm_insert_time1);
  	//	System.out.println(dtm_insert_time2);
// 		System.out.println(request.getParameter("m_name22"));
 		
 		Map map=new HashMap();
 		 
 		int page = Integer.valueOf(request.getParameter("page"));
		int limit = Integer.valueOf(request.getParameter("rows"));
	//	System.out.println(page+" "+limit);
		int start = (page-1)* limit;
		//int end  = start+limit;
		map.put("start", start);
		map.put("end", limit);
 
        map.put("total", ismscustomdao.getsmssubmitlist_count(map));
         map.put("rows",  ismscustomdao.getsmssubmitlist(map));
   	    return map;
		 
	}
	
}
