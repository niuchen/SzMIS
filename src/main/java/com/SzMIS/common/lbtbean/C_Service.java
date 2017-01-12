package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_Service{
	private Integer serviceid;//
	private Integer servicetype;//
	private Integer paytype;//
	private String price;//
	private String remark;//
	private String presentname;//
	private String presentinfo;//
	private Integer status;//
	private Integer maxmonth;//
	private Integer presentmonth;//
	private String servicedesc;//

	public Integer getServiceid(){
		return this.serviceid;
	}
	public void setServiceid(Integer serviceid){
		this.serviceid=serviceid;
	}
	public Integer getServicetype(){
		return this.servicetype;
	}
	public void setServicetype(Integer servicetype){
		this.servicetype=servicetype;
	}
	public Integer getPaytype(){
		return this.paytype;
	}
	public void setPaytype(Integer paytype){
		this.paytype=paytype;
	}
	public String getPrice(){
		return this.price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getPresentname(){
		return this.presentname;
	}
	public void setPresentname(String presentname){
		this.presentname=presentname;
	}
	public String getPresentinfo(){
		return this.presentinfo;
	}
	public void setPresentinfo(String presentinfo){
		this.presentinfo=presentinfo;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getMaxmonth(){
		return this.maxmonth;
	}
	public void setMaxmonth(Integer maxmonth){
		this.maxmonth=maxmonth;
	}
	public Integer getPresentmonth(){
		return this.presentmonth;
	}
	public void setPresentmonth(Integer presentmonth){
		this.presentmonth=presentmonth;
	}
	public String getServicedesc(){
		return this.servicedesc;
	}
	public void setServicedesc(String servicedesc){
		this.servicedesc=servicedesc;
	}

}