package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class DiscoverComment{
	private Integer commentid;//
	private Integer discoverid;//
	private Integer type;//
	private Integer usersid;//
	private Integer usertype;//
	private String content;//
	private String addtime;//
	private Integer level;//
	private Integer receiverid;//
	private Integer status;//

	public Integer getCommentid(){
		return this.commentid;
	}
	public void setCommentid(Integer commentid){
		this.commentid=commentid;
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
	public Integer getLevel(){
		return this.level;
	}
	public void setLevel(Integer level){
		this.level=level;
	}
	public Integer getReceiverid(){
		return this.receiverid;
	}
	public void setReceiverid(Integer receiverid){
		this.receiverid=receiverid;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}