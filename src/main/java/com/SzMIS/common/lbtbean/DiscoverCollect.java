package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class DiscoverCollect{
	private Integer collectid;//
	private Integer discoverid;//
	private Integer type;//
	private Integer usersid;//
	private Integer usertype;//
	private String addtime;//
	private Integer status;//

	public Integer getCollectid(){
		return this.collectid;
	}
	public void setCollectid(Integer collectid){
		this.collectid=collectid;
	}
	public Integer getDiscoverid(){
		return this.discoverid;
	}
	public void setDiscoverid(Integer discoverid){
		this.discoverid=discoverid;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}