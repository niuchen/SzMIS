package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class BusLine{
	private Integer buslineid;//
	private Integer schoolid;//
	private String linename;//
	private String begintime;//
	private String endtime;//
	private String linedesc;//
	private Integer state;//

	public Integer getBuslineid(){
		return this.buslineid;
	}
	public void setBuslineid(Integer buslineid){
		this.buslineid=buslineid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getLinename(){
		return this.linename;
	}
	public void setLinename(String linename){
		this.linename=linename;
	}
	public String getBegintime(){
		return this.begintime;
	}
	public void setBegintime(String begintime){
		this.begintime=begintime;
	}
	public String getEndtime(){
		return this.endtime;
	}
	public void setEndtime(String endtime){
		this.endtime=endtime;
	}
	public String getLinedesc(){
		return this.linedesc;
	}
	public void setLinedesc(String linedesc){
		this.linedesc=linedesc;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}

}