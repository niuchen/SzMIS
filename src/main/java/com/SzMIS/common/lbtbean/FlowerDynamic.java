package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class FlowerDynamic{
	private Integer dynamicid;//
	private Integer eduunitid;//
	private Integer flowernum;//
	private Integer usersid;//
	private Integer usertype;//
	private String addtime;//
	private Integer receiverid;//

	public Integer getDynamicid(){
		return this.dynamicid;
	}
	public void setDynamicid(Integer dynamicid){
		this.dynamicid=dynamicid;
	}
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}
	public Integer getFlowernum(){
		return this.flowernum;
	}
	public void setFlowernum(Integer flowernum){
		this.flowernum=flowernum;
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
	public Integer getReceiverid(){
		return this.receiverid;
	}
	public void setReceiverid(Integer receiverid){
		this.receiverid=receiverid;
	}

}