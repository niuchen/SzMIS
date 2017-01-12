package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class SmsCollect{
	private Integer smscollectid;//
	private Integer usersid;//
	private String content;//
	private String addtime;//

	public Integer getSmscollectid(){
		return this.smscollectid;
	}
	public void setSmscollectid(Integer smscollectid){
		this.smscollectid=smscollectid;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}