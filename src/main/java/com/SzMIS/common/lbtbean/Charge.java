package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class Charge{
	private Integer chargeid;//
	private Integer schoolid;//
	private Integer eduunitid;//
	private Integer studentid;//
	private Integer feetype;//
	private String fee;//
	private String feetime;//
	private String addtime;//
	private String operator;//
	private Integer state;//
	private String remark;//

	public Integer getChargeid(){
		return this.chargeid;
	}
	public void setChargeid(Integer chargeid){
		this.chargeid=chargeid;
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
	public Integer getFeetype(){
		return this.feetype;
	}
	public void setFeetype(Integer feetype){
		this.feetype=feetype;
	}
	public String getFee(){
		return this.fee;
	}
	public void setFee(String fee){
		this.fee=fee;
	}
	public String getFeetime(){
		return this.feetime;
	}
	public void setFeetime(String feetime){
		this.feetime=feetime;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}
	public String getOperator(){
		return this.operator;
	}
	public void setOperator(String operator){
		this.operator=operator;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

}