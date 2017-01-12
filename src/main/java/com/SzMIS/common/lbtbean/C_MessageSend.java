package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_MessageSend{
	private Integer messagesendid;//
	private Integer schoolid;//
	private Integer eduunitid;//
	private Integer level;//
	private String content;//
	private Integer addby;//
	private String addtime;//
	private Integer status;//
	private Integer pushstatus;//
	private Integer roleid;//

	public Integer getMessagesendid(){
		return this.messagesendid;
	}
	public void setMessagesendid(Integer messagesendid){
		this.messagesendid=messagesendid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}
	public Integer getLevel(){
		return this.level;
	}
	public void setLevel(Integer level){
		this.level=level;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public Integer getAddby(){
		return this.addby;
	}
	public void setAddby(Integer addby){
		this.addby=addby;
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
	public Integer getPushstatus(){
		return this.pushstatus;
	}
	public void setPushstatus(Integer pushstatus){
		this.pushstatus=pushstatus;
	}
	public Integer getRoleid(){
		return this.roleid;
	}
	public void setRoleid(Integer roleid){
		this.roleid=roleid;
	}

}