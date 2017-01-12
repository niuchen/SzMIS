package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class PersonalMessage{
	private Integer messageid;//
	private Integer classify;//
	private Integer sid;//
	private Integer messagetype;//
	private Integer tid;//
	private Integer senderid;//
	private Integer receiverid;//
	private String content;//
	private String sendtime;//
	private Integer status;//

	public Integer getMessageid(){
		return this.messageid;
	}
	public void setMessageid(Integer messageid){
		this.messageid=messageid;
	}
	public Integer getClassify(){
		return this.classify;
	}
	public void setClassify(Integer classify){
		this.classify=classify;
	}
	public Integer getSid(){
		return this.sid;
	}
	public void setSid(Integer sid){
		this.sid=sid;
	}
	public Integer getMessagetype(){
		return this.messagetype;
	}
	public void setMessagetype(Integer messagetype){
		this.messagetype=messagetype;
	}
	public Integer getTid(){
		return this.tid;
	}
	public void setTid(Integer tid){
		this.tid=tid;
	}
	public Integer getSenderid(){
		return this.senderid;
	}
	public void setSenderid(Integer senderid){
		this.senderid=senderid;
	}
	public Integer getReceiverid(){
		return this.receiverid;
	}
	public void setReceiverid(Integer receiverid){
		this.receiverid=receiverid;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getSendtime(){
		return this.sendtime;
	}
	public void setSendtime(String sendtime){
		this.sendtime=sendtime;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}