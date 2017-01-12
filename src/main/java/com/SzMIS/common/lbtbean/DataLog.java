package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class DataLog{
	private Integer logid;//
	private Integer dataid;//
	private Integer basetableid;//
	private Integer operatorid;//
	private String operatorname;//
	private String operation;//
	private String operationtime;//
	private Integer platform;//

	public Integer getLogid(){
		return this.logid;
	}
	public void setLogid(Integer logid){
		this.logid=logid;
	}
	public Integer getDataid(){
		return this.dataid;
	}
	public void setDataid(Integer dataid){
		this.dataid=dataid;
	}
	public Integer getBasetableid(){
		return this.basetableid;
	}
	public void setBasetableid(Integer basetableid){
		this.basetableid=basetableid;
	}
	public Integer getOperatorid(){
		return this.operatorid;
	}
	public void setOperatorid(Integer operatorid){
		this.operatorid=operatorid;
	}
	public String getOperatorname(){
		return this.operatorname;
	}
	public void setOperatorname(String operatorname){
		this.operatorname=operatorname;
	}
	public String getOperation(){
		return this.operation;
	}
	public void setOperation(String operation){
		this.operation=operation;
	}
	public String getOperationtime(){
		return this.operationtime;
	}
	public void setOperationtime(String operationtime){
		this.operationtime=operationtime;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}

}