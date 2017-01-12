package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class C_SafetyMachineLoginLog{
	private Integer logid;//
	private String machinecode;//
	private Integer machinetype;//
	private Integer schoolid;//
	private String logintime;//
	private String appver;//
	private String sysver;//
	private String imsi;//
	private String phonemodel;//

	public Integer getLogid(){
		return this.logid;
	}
	public void setLogid(Integer logid){
		this.logid=logid;
	}
	public String getMachinecode(){
		return this.machinecode;
	}
	public void setMachinecode(String machinecode){
		this.machinecode=machinecode;
	}
	public Integer getMachinetype(){
		return this.machinetype;
	}
	public void setMachinetype(Integer machinetype){
		this.machinetype=machinetype;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getLogintime(){
		return this.logintime;
	}
	public void setLogintime(String logintime){
		this.logintime=logintime;
	}
	public String getAppver(){
		return this.appver;
	}
	public void setAppver(String appver){
		this.appver=appver;
	}
	public String getSysver(){
		return this.sysver;
	}
	public void setSysver(String sysver){
		this.sysver=sysver;
	}
	public String getImsi(){
		return this.imsi;
	}
	public void setImsi(String imsi){
		this.imsi=imsi;
	}
	public String getPhonemodel(){
		return this.phonemodel;
	}
	public void setPhonemodel(String phonemodel){
		this.phonemodel=phonemodel;
	}

}