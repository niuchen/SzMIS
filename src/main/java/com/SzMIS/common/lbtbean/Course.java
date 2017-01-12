package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Course{
	private Integer courseid;//
	private Integer unitid;//
	private Integer subjectid;//
	private String content;//
	private Integer week;//
	private Integer suborder;//
	private Integer timerange;//
	private String addtime;//

	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid=courseid;
	}
	public Integer getUnitid(){
		return this.unitid;
	}
	public void setUnitid(Integer unitid){
		this.unitid=unitid;
	}
	public Integer getSubjectid(){
		return this.subjectid;
	}
	public void setSubjectid(Integer subjectid){
		this.subjectid=subjectid;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public Integer getWeek(){
		return this.week;
	}
	public void setWeek(Integer week){
		this.week=week;
	}
	public Integer getSuborder(){
		return this.suborder;
	}
	public void setSuborder(Integer suborder){
		this.suborder=suborder;
	}
	public Integer getTimerange(){
		return this.timerange;
	}
	public void setTimerange(Integer timerange){
		this.timerange=timerange;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}