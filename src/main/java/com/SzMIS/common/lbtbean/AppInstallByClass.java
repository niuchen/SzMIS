package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class AppInstallByClass{
	private Integer id;//
	private Integer schoolid;//
	private Integer eduunitid;//
	private String eduunitname;//
	private Integer stuappnum;//
	private Integer ordstuappnum;//
	private Integer stunum;//
	private Integer ordstunum;//
	private String reporttime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
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
	public String getEduunitname(){
		return this.eduunitname;
	}
	public void setEduunitname(String eduunitname){
		this.eduunitname=eduunitname;
	}
	public Integer getStuappnum(){
		return this.stuappnum;
	}
	public void setStuappnum(Integer stuappnum){
		this.stuappnum=stuappnum;
	}
	public Integer getOrdstuappnum(){
		return this.ordstuappnum;
	}
	public void setOrdstuappnum(Integer ordstuappnum){
		this.ordstuappnum=ordstuappnum;
	}
	public Integer getStunum(){
		return this.stunum;
	}
	public void setStunum(Integer stunum){
		this.stunum=stunum;
	}
	public Integer getOrdstunum(){
		return this.ordstunum;
	}
	public void setOrdstunum(Integer ordstunum){
		this.ordstunum=ordstunum;
	}
	public String getReporttime(){
		return this.reporttime;
	}
	public void setReporttime(String reporttime){
		this.reporttime=reporttime;
	}

}