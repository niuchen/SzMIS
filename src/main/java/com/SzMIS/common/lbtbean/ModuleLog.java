package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class ModuleLog{
	private Integer logid;//
	private Integer moduleid;//
	private Integer userid;//
	private String username;//
	private Integer usertype;//
	private String visittime;//
	private Integer platform;//

	public Integer getLogid(){
		return this.logid;
	}
	public void setLogid(Integer logid){
		this.logid=logid;
	}
	public Integer getModuleid(){
		return this.moduleid;
	}
	public void setModuleid(Integer moduleid){
		this.moduleid=moduleid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
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
	public String getVisittime(){
		return this.visittime;
	}
	public void setVisittime(String visittime){
		this.visittime=visittime;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}

}