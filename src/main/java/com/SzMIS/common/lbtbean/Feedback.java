package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Feedback{
	private Integer feedbackid;//
	private Integer userid;//
	private Integer moduleid;//
	private String feedbacktime;//
	private String content;//
	private String email;//
	private String phonemodel;//
	private String osversion;//
	private Integer appflag;//
	private String appversion;//
	private Integer isreply;//

	public Integer getFeedbackid(){
		return this.feedbackid;
	}
	public void setFeedbackid(Integer feedbackid){
		this.feedbackid=feedbackid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public Integer getModuleid(){
		return this.moduleid;
	}
	public void setModuleid(Integer moduleid){
		this.moduleid=moduleid;
	}
	public String getFeedbacktime(){
		return this.feedbacktime;
	}
	public void setFeedbacktime(String feedbacktime){
		this.feedbacktime=feedbacktime;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getPhonemodel(){
		return this.phonemodel;
	}
	public void setPhonemodel(String phonemodel){
		this.phonemodel=phonemodel;
	}
	public String getOsversion(){
		return this.osversion;
	}
	public void setOsversion(String osversion){
		this.osversion=osversion;
	}
	public Integer getAppflag(){
		return this.appflag;
	}
	public void setAppflag(Integer appflag){
		this.appflag=appflag;
	}
	public String getAppversion(){
		return this.appversion;
	}
	public void setAppversion(String appversion){
		this.appversion=appversion;
	}
	public Integer getIsreply(){
		return this.isreply;
	}
	public void setIsreply(Integer isreply){
		this.isreply=isreply;
	}

}