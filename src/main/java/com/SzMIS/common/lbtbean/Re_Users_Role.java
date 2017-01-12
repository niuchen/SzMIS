package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class Re_Users_Role{
	private Integer usersid;//
	private Integer roleid;//
	private Integer platform;//

	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public Integer getRoleid(){
		return this.roleid;
	}
	public void setRoleid(Integer roleid){
		this.roleid=roleid;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}

}