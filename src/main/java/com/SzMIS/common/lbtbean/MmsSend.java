package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class MmsSend{
	private Integer mmssendid;//
	private Integer usersid;//
	private Integer sendertype;//
	private String sendtime;//
	private String mmscontent;//
	private Integer outboxstate;//
	private String submittime;//
	private String reporttime;//
	private Integer platform;//
	private Integer operator;//
	private Integer roleid;//

	public Integer getMmssendid(){
		return this.mmssendid;
	}
	public void setMmssendid(Integer mmssendid){
		this.mmssendid=mmssendid;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public Integer getSendertype(){
		return this.sendertype;
	}
	public void setSendertype(Integer sendertype){
		this.sendertype=sendertype;
	}
	public String getSendtime(){
		return this.sendtime;
	}
	public void setSendtime(String sendtime){
		this.sendtime=sendtime;
	}
	public String getMmscontent(){
		return this.mmscontent;
	}
	public void setMmscontent(String mmscontent){
		this.mmscontent=mmscontent;
	}
	public Integer getOutboxstate(){
		return this.outboxstate;
	}
	public void setOutboxstate(Integer outboxstate){
		this.outboxstate=outboxstate;
	}
	public String getSubmittime(){
		return this.submittime;
	}
	public void setSubmittime(String submittime){
		this.submittime=submittime;
	}
	public String getReporttime(){
		return this.reporttime;
	}
	public void setReporttime(String reporttime){
		this.reporttime=reporttime;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}
	public Integer getOperator(){
		return this.operator;
	}
	public void setOperator(Integer operator){
		this.operator=operator;
	}
	public Integer getRoleid(){
		return this.roleid;
	}
	public void setRoleid(Integer roleid){
		this.roleid=roleid;
	}

}