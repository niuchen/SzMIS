package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class Teacher{
	private Integer teacherid;//
	private String teachernum;//
	private String officephone;//
	private Integer deptid;//
	private String teachertype;//
	private String certifications;//

	public Integer getTeacherid(){
		return this.teacherid;
	}
	public void setTeacherid(Integer teacherid){
		this.teacherid=teacherid;
	}
	public String getTeachernum(){
		return this.teachernum;
	}
	public void setTeachernum(String teachernum){
		this.teachernum=teachernum;
	}
	public String getOfficephone(){
		return this.officephone;
	}
	public void setOfficephone(String officephone){
		this.officephone=officephone;
	}
	public Integer getDeptid(){
		return this.deptid;
	}
	public void setDeptid(Integer deptid){
		this.deptid=deptid;
	}
	public String getTeachertype(){
		return this.teachertype;
	}
	public void setTeachertype(String teachertype){
		this.teachertype=teachertype;
	}
	public String getCertifications(){
		return this.certifications;
	}
	public void setCertifications(String certifications){
		this.certifications=certifications;
	}

}