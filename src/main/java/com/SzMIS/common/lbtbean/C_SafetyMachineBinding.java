package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_SafetyMachineBinding{
	private String machinecode;//
	private Integer schoolid;//
	private Integer addby;//
	private String addtime;//

	public String getMachinecode(){
		return this.machinecode;
	}
	public void setMachinecode(String machinecode){
		this.machinecode=machinecode;
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
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}