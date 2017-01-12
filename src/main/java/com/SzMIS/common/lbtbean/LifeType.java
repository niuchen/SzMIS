package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class LifeType{
	private Integer lifetypeid;//
	private String typename;//
	private Integer isdefault;//

	public Integer getLifetypeid(){
		return this.lifetypeid;
	}
	public void setLifetypeid(Integer lifetypeid){
		this.lifetypeid=lifetypeid;
	}
	public String getTypename(){
		return this.typename;
	}
	public void setTypename(String typename){
		this.typename=typename;
	}
	public Integer getIsdefault(){
		return this.isdefault;
	}
	public void setIsdefault(Integer isdefault){
		this.isdefault=isdefault;
	}

}