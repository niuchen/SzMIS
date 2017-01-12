package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_HWConfig{
	private Integer id;//
	private Integer studentid;//
	private String agerange;//
	private Integer beginmonth;//
	private Integer endmonth;//
	private String height;//
	private String weight;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getStudentid(){
		return this.studentid;
	}
	public void setStudentid(Integer studentid){
		this.studentid=studentid;
	}
	public String getAgerange(){
		return this.agerange;
	}
	public void setAgerange(String agerange){
		this.agerange=agerange;
	}
	public Integer getBeginmonth(){
		return this.beginmonth;
	}
	public void setBeginmonth(Integer beginmonth){
		this.beginmonth=beginmonth;
	}
	public Integer getEndmonth(){
		return this.endmonth;
	}
	public void setEndmonth(Integer endmonth){
		this.endmonth=endmonth;
	}
	public String getHeight(){
		return this.height;
	}
	public void setHeight(String height){
		this.height=height;
	}
	public String getWeight(){
		return this.weight;
	}
	public void setWeight(String weight){
		this.weight=weight;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}