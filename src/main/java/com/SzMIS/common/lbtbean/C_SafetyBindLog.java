package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_SafetyBindLog{
	private Integer id;//
	private String code;//
	private Integer type;//
	private Integer bindid;//
	private String operation;//
	private Integer addby;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getBindid(){
		return this.bindid;
	}
	public void setBindid(Integer bindid){
		this.bindid=bindid;
	}
	public String getOperation(){
		return this.operation;
	}
	public void setOperation(String operation){
		this.operation=operation;
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