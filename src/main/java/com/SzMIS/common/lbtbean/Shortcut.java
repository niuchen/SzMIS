package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class Shortcut{
	private Integer shutcutid;//
	private Integer usersid;//
	private Integer moduleid;//
	private Integer state;//
	private Integer sort;//
	private Integer platform;//

	public Integer getShutcutid(){
		return this.shutcutid;
	}
	public void setShutcutid(Integer shutcutid){
		this.shutcutid=shutcutid;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public Integer getModuleid(){
		return this.moduleid;
	}
	public void setModuleid(Integer moduleid){
		this.moduleid=moduleid;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort=sort;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}

}