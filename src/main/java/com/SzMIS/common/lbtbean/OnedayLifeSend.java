package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class OnedayLifeSend{
	private Integer onedaylifesendid;//
	private Integer studentid;//
	private Integer eduunitid;//
	private Integer schoolid;//
	private String course;//
	private String cookbook;//
	private String remark;//
	private String sendtime;//

	public Integer getOnedaylifesendid(){
		return this.onedaylifesendid;
	}
	public void setOnedaylifesendid(Integer onedaylifesendid){
		this.onedaylifesendid=onedaylifesendid;
	}
	public Integer getStudentid(){
		return this.studentid;
	}
	public void setStudentid(Integer studentid){
		this.studentid=studentid;
	}
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getCourse(){
		return this.course;
	}
	public void setCourse(String course){
		this.course=course;
	}
	public String getCookbook(){
		return this.cookbook;
	}
	public void setCookbook(String cookbook){
		this.cookbook=cookbook;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getSendtime(){
		return this.sendtime;
	}
	public void setSendtime(String sendtime){
		this.sendtime=sendtime;
	}

}