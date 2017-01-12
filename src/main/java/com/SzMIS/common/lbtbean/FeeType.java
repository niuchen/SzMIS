package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class FeeType{
	private Integer feetypeid;//
	private Integer schoolid;//
	private String feename;//
	private Integer state;//
	private Integer sort;//
	private Integer type;//

	public Integer getFeetypeid(){
		return this.feetypeid;
	}
	public void setFeetypeid(Integer feetypeid){
		this.feetypeid=feetypeid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getFeename(){
		return this.feename;
	}
	public void setFeename(String feename){
		this.feename=feename;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort=sort;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}

}