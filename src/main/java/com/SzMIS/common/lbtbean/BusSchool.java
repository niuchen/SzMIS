package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class BusSchool{
	private Integer busid;//
	private String busno;//
	private String buslicense;//
	private String busbrand;//
	private String buscolor;//
	private Integer buslimit;//
	private Integer schoolid;//
	private String machinecode;//
	private String driver;//
	private String drivertel;//
	private Integer state;//

	public Integer getBusid(){
		return this.busid;
	}
	public void setBusid(Integer busid){
		this.busid=busid;
	}
	public String getBusno(){
		return this.busno;
	}
	public void setBusno(String busno){
		this.busno=busno;
	}
	public String getBuslicense(){
		return this.buslicense;
	}
	public void setBuslicense(String buslicense){
		this.buslicense=buslicense;
	}
	public String getBusbrand(){
		return this.busbrand;
	}
	public void setBusbrand(String busbrand){
		this.busbrand=busbrand;
	}
	public String getBuscolor(){
		return this.buscolor;
	}
	public void setBuscolor(String buscolor){
		this.buscolor=buscolor;
	}
	public Integer getBuslimit(){
		return this.buslimit;
	}
	public void setBuslimit(Integer buslimit){
		this.buslimit=buslimit;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getMachinecode(){
		return this.machinecode;
	}
	public void setMachinecode(String machinecode){
		this.machinecode=machinecode;
	}
	public String getDriver(){
		return this.driver;
	}
	public void setDriver(String driver){
		this.driver=driver;
	}
	public String getDrivertel(){
		return this.drivertel;
	}
	public void setDrivertel(String drivertel){
		this.drivertel=drivertel;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}

}