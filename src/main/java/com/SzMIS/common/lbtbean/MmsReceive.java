package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class MmsReceive{
	private Integer mmsreceiveid;//
	private Integer usersid;//
	private String content;//
	private String receivetime;//
	private Integer mmssendid;//
	private Integer sendstate;//
	private Integer inboxstate;//
	private Integer eduunitid;//
	private String receiverphone;//
	private String receivestate;//

	public Integer getMmsreceiveid(){
		return this.mmsreceiveid;
	}
	public void setMmsreceiveid(Integer mmsreceiveid){
		this.mmsreceiveid=mmsreceiveid;
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
	public String getReceivetime(){
		return this.receivetime;
	}
	public void setReceivetime(String receivetime){
		this.receivetime=receivetime;
	}
	public Integer getMmssendid(){
		return this.mmssendid;
	}
	public void setMmssendid(Integer mmssendid){
		this.mmssendid=mmssendid;
	}
	public Integer getSendstate(){
		return this.sendstate;
	}
	public void setSendstate(Integer sendstate){
		this.sendstate=sendstate;
	}
	public Integer getInboxstate(){
		return this.inboxstate;
	}
	public void setInboxstate(Integer inboxstate){
		this.inboxstate=inboxstate;
	}
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}
	public String getReceiverphone(){
		return this.receiverphone;
	}
	public void setReceiverphone(String receiverphone){
		this.receiverphone=receiverphone;
	}
	public String getReceivestate(){
		return this.receivestate;
	}
	public void setReceivestate(String receivestate){
		this.receivestate=receivestate;
	}

}