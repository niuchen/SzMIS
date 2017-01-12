package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class C_LiveAccountManage{
	private String account;//
	private String password;//
	private String roomid;//
	private String addby;//
	private String addtime;//

	public String getAccount(){
		return this.account;
	}
	public void setAccount(String account){
		this.account=account;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getRoomid(){
		return this.roomid;
	}
	public void setRoomid(String roomid){
		this.roomid=roomid;
	}
	public String getAddby(){
		return this.addby;
	}
	public void setAddby(String addby){
		this.addby=addby;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}