package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class AwardReportInfo{
	private Integer id;//
	private Integer cityid;//
	private Integer countryid;//
	private Integer schoolid;//
	private String submittime;//
	private String schoolmaster;//
	private String staff;//
	private String phone;//
	private String fee;//
	private Integer status;//
	private String remark;//
	private String endtime;//
	private String operator;//
	private Integer awardreportid;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getCityid(){
		return this.cityid;
	}
	public void setCityid(Integer cityid){
		this.cityid=cityid;
	}
	public Integer getCountryid(){
		return this.countryid;
	}
	public void setCountryid(Integer countryid){
		this.countryid=countryid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getSubmittime(){
		return this.submittime;
	}
	public void setSubmittime(String submittime){
		this.submittime=submittime;
	}
	public String getSchoolmaster(){
		return this.schoolmaster;
	}
	public void setSchoolmaster(String schoolmaster){
		this.schoolmaster=schoolmaster;
	}
	public String getStaff(){
		return this.staff;
	}
	public void setStaff(String staff){
		this.staff=staff;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getFee(){
		return this.fee;
	}
	public void setFee(String fee){
		this.fee=fee;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getEndtime(){
		return this.endtime;
	}
	public void setEndtime(String endtime){
		this.endtime=endtime;
	}
	public String getOperator(){
		return this.operator;
	}
	public void setOperator(String operator){
		this.operator=operator;
	}
	public Integer getAwardreportid(){
		return this.awardreportid;
	}
	public void setAwardreportid(Integer awardreportid){
		this.awardreportid=awardreportid;
	}

}