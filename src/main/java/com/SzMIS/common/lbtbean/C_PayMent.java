package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class C_PayMent{
	private Integer id;//
	private Integer userid;//
	private String paymentdate;//
	private Integer months;//
	private Integer serviceid;//
	private Integer servicetype;//
	private String begindate;//
	private String enddate;//
	private String amount;//
	private String targetfee;//
	private String targetamount;//
	private Integer paytypes;//
	private String orderid;//
	private Integer status;//
	private String yborderid;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public String getPaymentdate(){
		return this.paymentdate;
	}
	public void setPaymentdate(String paymentdate){
		this.paymentdate=paymentdate;
	}
	public Integer getMonths(){
		return this.months;
	}
	public void setMonths(Integer months){
		this.months=months;
	}
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
	public String getBegindate(){
		return this.begindate;
	}
	public void setBegindate(String begindate){
		this.begindate=begindate;
	}
	public String getEnddate(){
		return this.enddate;
	}
	public void setEnddate(String enddate){
		this.enddate=enddate;
	}
	public String getAmount(){
		return this.amount;
	}
	public void setAmount(String amount){
		this.amount=amount;
	}
	public String getTargetfee(){
		return this.targetfee;
	}
	public void setTargetfee(String targetfee){
		this.targetfee=targetfee;
	}
	public String getTargetamount(){
		return this.targetamount;
	}
	public void setTargetamount(String targetamount){
		this.targetamount=targetamount;
	}
	public Integer getPaytypes(){
		return this.paytypes;
	}
	public void setPaytypes(Integer paytypes){
		this.paytypes=paytypes;
	}
	public String getOrderid(){
		return this.orderid;
	}
	public void setOrderid(String orderid){
		this.orderid=orderid;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public String getYborderid(){
		return this.yborderid;
	}
	public void setYborderid(String yborderid){
		this.yborderid=yborderid;
	}

}