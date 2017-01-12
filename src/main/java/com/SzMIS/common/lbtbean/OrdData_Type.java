package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class OrdData_Type{
	private Integer typeid;//
	private String typename;//
	private String typedesc;//
	private Integer state;//
	private Integer price;//

	public Integer getTypeid(){
		return this.typeid;
	}
	public void setTypeid(Integer typeid){
		this.typeid=typeid;
	}
	public String getTypename(){
		return this.typename;
	}
	public void setTypename(String typename){
		this.typename=typename;
	}
	public String getTypedesc(){
		return this.typedesc;
	}
	public void setTypedesc(String typedesc){
		this.typedesc=typedesc;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getPrice(){
		return this.price;
	}
	public void setPrice(Integer price){
		this.price=price;
	}

}