package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class SmsSign{
	private Integer smssignid;//
	private Integer usersid;//
	private String signname;//
	private Integer isdefault;//

	public Integer getSmssignid(){
		return this.smssignid;
	}
	public void setSmssignid(Integer smssignid){
		this.smssignid=smssignid;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public String getSignname(){
		return this.signname;
	}
	public void setSignname(String signname){
		this.signname=signname;
	}
	public Integer getIsdefault(){
		return this.isdefault;
	}
	public void setIsdefault(Integer isdefault){
		this.isdefault=isdefault;
	}

}