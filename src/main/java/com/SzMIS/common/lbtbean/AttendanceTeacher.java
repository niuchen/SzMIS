package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class AttendanceTeacher{
	private Integer attendanceid;//
	private Integer schoolid;//
	private Integer deptid;//
	private Integer teacherid;//
	private String cardtime;//
	private Integer state;//
	private String safetycard;//
	private String phone;//
	private String photo;//
	private String temperature;//
	private String uploadtime;//

	public Integer getAttendanceid(){
		return this.attendanceid;
	}
	public void setAttendanceid(Integer attendanceid){
		this.attendanceid=attendanceid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public Integer getDeptid(){
		return this.deptid;
	}
	public void setDeptid(Integer deptid){
		this.deptid=deptid;
	}
	public Integer getTeacherid(){
		return this.teacherid;
	}
	public void setTeacherid(Integer teacherid){
		this.teacherid=teacherid;
	}
	public String getCardtime(){
		return this.cardtime;
	}
	public void setCardtime(String cardtime){
		this.cardtime=cardtime;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public String getSafetycard(){
		return this.safetycard;
	}
	public void setSafetycard(String safetycard){
		this.safetycard=safetycard;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhoto(){
		return this.photo;
	}
	public void setPhoto(String photo){
		this.photo=photo;
	}
	public String getTemperature(){
		return this.temperature;
	}
	public void setTemperature(String temperature){
		this.temperature=temperature;
	}
	public String getUploadtime(){
		return this.uploadtime;
	}
	public void setUploadtime(String uploadtime){
		this.uploadtime=uploadtime;
	}

}