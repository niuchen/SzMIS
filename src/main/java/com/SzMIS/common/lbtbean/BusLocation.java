package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class BusLocation{
	private Integer id;//
	private Integer schoolid;//
	private Integer busid;//
	private Integer lineid;//
	private String xposition;//
	private String yposition;//
	private String precision;//
	private String locationtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
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
	public String getXposition(){
		return this.xposition;
	}
	public void setXposition(String xposition){
		this.xposition=xposition;
	}
	public String getYposition(){
		return this.yposition;
	}
	public void setYposition(String yposition){
		this.yposition=yposition;
	}
	public String getPrecision(){
		return this.precision;
	}
	public void setPrecision(String precision){
		this.precision=precision;
	}
	public String getLocationtime(){
		return this.locationtime;
	}
	public void setLocationtime(String locationtime){
		this.locationtime=locationtime;
	}

}