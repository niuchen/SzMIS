package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class LoginLog{
	private Integer logid;//
	private String userid;//
	private String username;//
	private Integer usertype;//
	private String loginip;//
	private String logintime;//
	private Integer platform;//
	private String macaddress;//
	private String appver;//
	private String phonemodel;//
	private String sysver;//
	private String imsi;//

	public Integer getLogid(){
		return this.logid;
	}
	public void setLogid(Integer logid){
		this.logid=logid;
	}
	public String getUserid(){
		return this.userid;
	}
	public void setUserid(String userid){
		this.userid=userid;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}
	public String getLoginip(){
		return this.loginip;
	}
	public void setLoginip(String loginip){
		this.loginip=loginip;
	}
	public String getLogintime(){
		return this.logintime;
	}
	public void setLogintime(String logintime){
		this.logintime=logintime;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}
	public String getMacaddress(){
		return this.macaddress;
	}
	public void setMacaddress(String macaddress){
		this.macaddress=macaddress;
	}
	public String getAppver(){
		return this.appver;
	}
	public void setAppver(String appver){
		this.appver=appver;
	}
	public String getPhonemodel(){
		return this.phonemodel;
	}
	public void setPhonemodel(String phonemodel){
		this.phonemodel=phonemodel;
	}
	public String getSysver(){
		return this.sysver;
	}
	public void setSysver(String sysver){
		this.sysver=sysver;
	}
	public String getImsi(){
		return this.imsi;
	}
	public void setImsi(String imsi){
		this.imsi=imsi;
	}

}