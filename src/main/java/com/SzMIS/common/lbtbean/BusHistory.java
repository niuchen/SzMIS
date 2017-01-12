package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class BusHistory{
	private String id;//
	private Integer schoolid;//
	private Integer busid;//
	private Integer lineid;//
	private String rundate;//
	private String drivername;//
	private Integer teacherid;//

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id=id;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public Integer getBusid(){
		return this.busid;
	}
	public void setBusid(Integer busid){
		this.busid=busid;
	}
	public Integer getLineid(){
		return this.lineid;
	}
	public void setLineid(Integer lineid){
		this.lineid=lineid;
	}
	public String getRundate(){
		return this.rundate;
	}
	public void setRundate(String rundate){
		this.rundate=rundate;
	}
	public String getDrivername(){
		return this.drivername;
	}
	public void setDrivername(String drivername){
		this.drivername=drivername;
	}
	public Integer getTeacherid(){
		return this.teacherid;
	}
	public void setTeacherid(Integer teacherid){
		this.teacherid=teacherid;
	}

}