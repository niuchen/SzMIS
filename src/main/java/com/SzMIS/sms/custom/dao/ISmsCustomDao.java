package com.SzMIS.sms.custom.dao;

 
 

import java.util.List;
import java.util.Map;

import com.SzMIS.common.lbtbean.Area;
import com.SzMIS.common.lbtbean.School;
import com.SzMIS.sms.custom.pojo.Jzsms;
 import com.SzMIS.sms.custom.pojo.Lsyzsms;
import com.SzMIS.sms.custom.pojo.Smssubmit;

  

public interface ISmsCustomDao {
	/**查询城市***/
	 public List<Area> getcitylist(Map map);
	 /**查询城市的区县***/
	 public List<Area> getcountylist(Map map);
	 
	 /**查询幼儿园***/
 	 public List<School> getSchoollist(Map map);
	 /**查询幼儿园***/
 	 public Integer getSchoolcount(Map map);
 	 
	 /**查询老师园长的短信发送名单***/
 	 public List<Lsyzsms> getlsyzlist(Smssubmit s);
 	 /**查询老师园长的短信发送名单 的人员总数***/
 	 public Integer getlsyzlist_size(Smssubmit s);
 	 /**查询家长的短信发送名单***/
 	 public List<Jzsms> getJzlist(Smssubmit s);
 	 /**查询家长的短信发送名单 的人员总数***/
 	 public Integer getJzlist_size(Smssubmit s);
 	
 	 /**添加发送短信提交的主内容信息**/
 	 public Integer smssubmit_insert(Smssubmit smssubmit);
 	 /***循环添加短信发送记录**/
 	 public Integer Lsyzsms_insert(com.SzMIS.sms.custom.pojo.Lsyzsms lsyzsms);
 	 /***循环添加短信发送记录**/
 	 public Integer Jzsms_insert(com.SzMIS.sms.custom.pojo.Jzsms Jzsms);
 	
 	 /***分页查询短信发送记录****/
 	 public List<Smssubmit> getsmssubmitlist(Map map);
 	 /***分页查询短信发送记录总数****/
 	 public Integer getsmssubmitlist_count(Map map);
}
