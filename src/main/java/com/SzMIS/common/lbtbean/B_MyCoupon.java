package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class B_MyCoupon{
	private String couponid;//
	private Integer userid;//
	private Integer type;//
	private String discount;//
	private String description;//
	private String applyto;//
	private String endtime;//
	private Integer status;//

	public String getCouponid(){
		return this.couponid;
	}
	public void setCouponid(String couponid){
		this.couponid=couponid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public String getDiscount(){
		return this.discount;
	}
	public void setDiscount(String discount){
		this.discount=discount;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getApplyto(){
		return this.applyto;
	}
	public void setApplyto(String applyto){
		this.applyto=applyto;
	}
	public String getEndtime(){
		return this.endtime;
	}
	public void setEndtime(String endtime){
		this.endtime=endtime;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}