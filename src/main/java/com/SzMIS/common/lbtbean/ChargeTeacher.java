package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class ChargeTeacher{
	private Integer chargeid;//
	private Integer schoolid;//
	private Integer deptid;//
	private Integer teacherid;//
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