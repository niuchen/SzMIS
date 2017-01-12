package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class UserSecurity{
	private Integer usersid;//
	private Integer moduleid;//
	private Integer roleid;//

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
	public Integer getRoleid(){
		return this.roleid;
	}
	public void setRoleid(Integer roleid){
		this.roleid=roleid;
	}

}