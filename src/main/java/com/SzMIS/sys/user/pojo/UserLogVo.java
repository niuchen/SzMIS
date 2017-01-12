package com.SzMIS.sys.user.pojo;

import com.SzMIS.common.bean.T_USERS_INFO;

 

 
  

 
public class UserLogVo extends T_USERS_INFO{
	 String ip;//本次IP
	 String maxlogdate;//上次登陆时间
	 String maxlogip;//上传登陆IP
	 public String getMaxlogip() {
		return maxlogip;
	}

	public void setMaxlogip(String maxlogip) {
		this.maxlogip = maxlogip;
	}

	public String getMaxlogdate() {
		return maxlogdate;
	}

	public void setMaxlogdate(String maxlogdate) {
		this.maxlogdate = maxlogdate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}


}
