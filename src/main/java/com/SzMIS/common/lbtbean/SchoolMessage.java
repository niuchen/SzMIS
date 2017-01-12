package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class SchoolMessage{
	private Integer messageid;//
	private String title;//
	private String content;//
	private Integer receivertype;//
	private Integer state;//
	private Integer schoolid;//
	private Integer addby;//
	private String addtime;//

	public Integer getMessageid(){
		return this.messageid;
	}
	public void setMessageid(Integer messageid){
		this.messageid=messageid;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public Integer getReceivertype(){
		return this.receivertype;
	}
	public void setReceivertype(Integer receivertype){
		this.receivertype=receivertype;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
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

}