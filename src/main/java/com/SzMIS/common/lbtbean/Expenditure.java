package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class Expenditure{
	private Integer expenditureid;//
	private Integer schoolid;//
	private String expends;//
	private String desc;//
	private String fee;//
	private String feetime;//
	private String addtime;//
	private Integer state;//

	public Integer getExpenditureid(){
		return this.expenditureid;
	}
	public void setExpenditureid(Integer expenditureid){
		this.expenditureid=expenditureid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getExpends(){
		return this.expends;
	}
	public void setExpends(String expends){
		this.expends=expends;
	}
	public String getDesc(){
		return this.desc;
	}
	public void setDesc(String desc){
		this.desc=desc;
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
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}

}