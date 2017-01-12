package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_OrdData{
	private String orddataid;//
	private String usersid;//
	private Integer servicetype;//
	private String begintime;//
	private String endtime;//
	private Integer status;//
	private String semester;//

	public String getOrddataid(){
		return this.orddataid;
	}
	public void setOrddataid(String orddataid){
		this.orddataid=orddataid;
	}
	public String getUsersid(){
		return this.usersid;
	}
	public void setUsersid(String usersid){
		this.usersid=usersid;
	}
	public Integer getServicetype(){
		return this.servicetype;
	}
	public void setServicetype(Integer servicetype){
		this.servicetype=servicetype;
	}
	public String getBegintime(){
		return this.begintime;
	}
	public void setBegintime(String begintime){
		this.begintime=begintime;
	}
	public String getEndtime(){
		return this.endtime;
	}
	public void setEndtime(String endtime){
		this.endtime=endtime;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public String getSemester(){
		return this.semester;
	}
	public void setSemester(String semester){
		this.semester=semester;
	}

}