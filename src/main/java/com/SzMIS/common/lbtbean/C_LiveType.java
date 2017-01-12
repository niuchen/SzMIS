package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_LiveType{
	private Integer typeid;//
	private String typename;//
	private Integer uservideomin;//
	private Integer uservideomax;//
	private Integer classvideomin;//
	private Integer classvideomax;//
	private Integer status;//

	public Integer getTypeid(){
		return this.typeid;
	}
	public void setTypeid(Integer typeid){
		this.typeid=typeid;
	}
	public String getTypename(){
		return this.typename;
	}
	public void setTypename(String typename){
		this.typename=typename;
	}
	public Integer getUservideomin(){
		return this.uservideomin;
	}
	public void setUservideomin(Integer uservideomin){
		this.uservideomin=uservideomin;
	}
	public Integer getUservideomax(){
		return this.uservideomax;
	}
	public void setUservideomax(Integer uservideomax){
		this.uservideomax=uservideomax;
	}
	public Integer getClassvideomin(){
		return this.classvideomin;
	}
	public void setClassvideomin(Integer classvideomin){
		this.classvideomin=classvideomin;
	}
	public Integer getClassvideomax(){
		return this.classvideomax;
	}
	public void setClassvideomax(Integer classvideomax){
		this.classvideomax=classvideomax;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}