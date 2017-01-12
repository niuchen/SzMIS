package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class B_PhotoBookOrder{
	private String orderid;//
	private Integer photobookid;//
	private Integer count;//
	private String price;//
	private Integer paytype;//
	private String amount;//
	private Integer userid;//
	private String addtime;//
	private Integer status;//
	private String yborderid;//
	private String couponid;//
	private String pdfurl;//
	private String orderdesc;//

	public String getOrderid(){
		return this.orderid;
	}
	public void setOrderid(String orderid){
		this.orderid=orderid;
	}
	public Integer getPhotobookid(){
		return this.photobookid;
	}
	public void setPhotobookid(Integer photobookid){
		this.photobookid=photobookid;
	}
	public Integer getCount(){
		return this.count;
	}
	public void setCount(Integer count){
		this.count=count;
	}
	public String getPrice(){
		return this.price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public Integer getPaytype(){
		return this.paytype;
	}
	public void setPaytype(Integer paytype){
		this.paytype=paytype;
	}
	public String getAmount(){
		return this.amount;
	}
	public void setAmount(String amount){
		this.amount=amount;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
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
	public String getCouponid(){
		return this.couponid;
	}
	public void setCouponid(String couponid){
		this.couponid=couponid;
	}
	public String getPdfurl(){
		return this.pdfurl;
	}
	public void setPdfurl(String pdfurl){
		this.pdfurl=pdfurl;
	}
	public String getOrderdesc(){
		return this.orderdesc;
	}
	public void setOrderdesc(String orderdesc){
		this.orderdesc=orderdesc;
	}

}