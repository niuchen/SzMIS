package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_SafetyMachine{
	private Integer factoryid;//
	private String factorycode;//
	private String machinecode;//
	private String machinecpu;//
	private Integer machinetype;//
	private Integer heartbeatstatus;//
	private Integer status;//
	private Integer addby;//
	private String addtime;//

	public Integer getFactoryid(){
		return this.factoryid;
	}
	public void setFactoryid(Integer factoryid){
		this.factoryid=factoryid;
	}
	public String getFactorycode(){
		return this.factorycode;
	}
	public void setFactorycode(String factorycode){
		this.factorycode=factorycode;
	}
	public String getMachinecode(){
		return this.machinecode;
	}
	public void setMachinecode(String machinecode){
		this.machinecode=machinecode;
	}
	public String getMachinecpu(){
		return this.machinecpu;
	}
	public void setMachinecpu(String machinecpu){
		this.machinecpu=machinecpu;
	}
	public Integer getMachinetype(){
		return this.machinetype;
	}
	public void setMachinetype(Integer machinetype){
		this.machinetype=machinetype;
	}
	public Integer getHeartbeatstatus(){
		return this.heartbeatstatus;
	}
	public void setHeartbeatstatus(Integer heartbeatstatus){
		this.heartbeatstatus=heartbeatstatus;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
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