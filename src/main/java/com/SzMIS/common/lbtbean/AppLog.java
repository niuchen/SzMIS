package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class AppLog{
	private Integer logid;//
	private String userid;//
	private String phonemodel;//
	private String sysver;//
	private String appver;//
	private Integer platform;//
	private String addtime;//
	private Integer moduleid;//
	private String loginfo;//

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
	public String getAppver(){
		return this.appver;
	}
	public void setAppver(String appver){
		this.appver=appver;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}
	public Integer getModuleid(){
		return this.moduleid;
	}
	public void setModuleid(Integer moduleid){
		this.moduleid=moduleid;
	}
	public String getLoginfo(){
		return this.loginfo;
	}
	public void setLoginfo(String loginfo){
		this.loginfo=loginfo;
	}

}