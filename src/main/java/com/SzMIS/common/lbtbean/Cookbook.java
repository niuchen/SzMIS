package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class Cookbook{
	private Integer cookbookid;//
	private Integer schoolid;//
	private Integer addby;//
	private Integer cookbooktype;//
	private String cookbookdate;//
	private String cookbookcontent;//

	public Integer getCookbookid(){
		return this.cookbookid;
	}
	public void setCookbookid(Integer cookbookid){
		this.cookbookid=cookbookid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public Integer getAddby(){
		return this.addby;
	}
	public void setAddby(Integer addby){
		this.addby=addby;
	}
	public Integer getCookbooktype(){
		return this.cookbooktype;
	}
	public void setCookbooktype(Integer cookbooktype){
		this.cookbooktype=cookbooktype;
	}
	public String getCookbookdate(){
		return this.cookbookdate;
	}
	public void setCookbookdate(String cookbookdate){
		this.cookbookdate=cookbookdate;
	}
	public String getCookbookcontent(){
		return this.cookbookcontent;
	}
	public void setCookbookcontent(String cookbookcontent){
		this.cookbookcontent=cookbookcontent;
	}

}