package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class C_ZbyLiveAccountManage{
	private Integer id;//
	private Integer usersid;//
	private String password;//
	private Integer yzb_userid;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public Integer getYzb_userid(){
		return this.yzb_userid;
	}
	public void setYzb_userid(Integer yzb_userid){
		this.yzb_userid=yzb_userid;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}