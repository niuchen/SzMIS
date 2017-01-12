package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Attendance{
	private Integer attendanceid;//
	private Integer schoolid;//
	private Integer eduunitid;//
	private Integer studentid;//
	private String cardtime;//
	private Integer state;//
	private String safetycard;//
	private String phone;//
	private String photo;//
	private String temperature;//
	private String uploadtime;//
	private Integer updown;//
	private String machinecode;//
	private Integer sendtemp;//

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
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}
	public Integer getStudentid(){
		return this.studentid;
	}
	public void setStudentid(Integer studentid){
		this.studentid=studentid;
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
	public Integer getUpdown(){
		return this.updown;
	}
	public void setUpdown(Integer updown){
		this.updown=updown;
	}
	public String getMachinecode(){
		return this.machinecode;
	}
	public void setMachinecode(String machinecode){
		this.machinecode=machinecode;
	}
	public Integer getSendtemp(){
		return this.sendtemp;
	}
	public void setSendtemp(Integer sendtemp){
		this.sendtemp=sendtemp;
	}

}