package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_MessageReceive{
	private Integer messagereceiveid;//
	private Integer receiverid;//
	private Integer receivertype;//
	private Integer messagesendid;//
	private String receivetime;//
	private Integer status;//
	private Integer flag;//
	private Integer eduunitid;//
	private Integer roleid;//

	public Integer getMessagereceiveid(){
		return this.messagereceiveid;
	}
	public void setMessagereceiveid(Integer messagereceiveid){
		this.messagereceiveid=messagereceiveid;
	}
	public Integer getReceiverid(){
		return this.receiverid;
	}
	public void setReceiverid(Integer receiverid){
		this.receiverid=receiverid;
	}
	public Integer getReceivertype(){
		return this.receivertype;
	}
	public void setReceivertype(Integer receivertype){
		this.receivertype=receivertype;
	}
	public Integer getMessagesendid(){
		return this.messagesendid;
	}
	public void setMessagesendid(Integer messagesendid){
		this.messagesendid=messagesendid;
	}
	public String getReceivetime(){
		return this.receivetime;
	}
	public void setReceivetime(String receivetime){
		this.receivetime=receivetime;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getFlag(){
		return this.flag;
	}
	public void setFlag(Integer flag){
		this.flag=flag;
	}
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}
	public Integer getRoleid(){
		return this.roleid;
	}
	public void setRoleid(Integer roleid){
		this.roleid=roleid;
	}

}