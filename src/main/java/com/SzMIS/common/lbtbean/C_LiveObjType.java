package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_LiveObjType{
	private Integer typeid;//
	private String typename;//
	private Integer weektimesmin;//
	private Integer weektimesmax;//
	private Integer status;//

	public Integer getTypeid(){
		return this.typeid;
	}
	public void setTypeid(Integer typeid){
		this.typeid=typeid;
	}
	public String getTypename(){
		return this.typename;
	}
	public void setTypename(String typename){
		this.typename=typename;
	}
	public Integer getWeektimesmin(){
		return this.weektimesmin;
	}
	public void setWeektimesmin(Integer weektimesmin){
		this.weektimesmin=weektimesmin;
	}
	public Integer getWeektimesmax(){
		return this.weektimesmax;
	}
	public void setWeektimesmax(Integer weektimesmax){
		this.weektimesmax=weektimesmax;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}