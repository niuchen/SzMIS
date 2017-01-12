package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class SmsTempType{
	private Integer smstemptypeid;//
	private Integer uptype;//
	private String name;//
	private Integer level;//
	private Integer state;//

	public Integer getSmstemptypeid(){
		return this.smstemptypeid;
	}
	public void setSmstemptypeid(Integer smstemptypeid){
		this.smstemptypeid=smstemptypeid;
	}
	public Integer getUptype(){
		return this.uptype;
	}
	public void setUptype(Integer uptype){
		this.uptype=uptype;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Integer getLevel(){
		return this.level;
	}
	public void setLevel(Integer level){
		this.level=level;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}

}