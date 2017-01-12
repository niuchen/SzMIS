package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class C_LiveAccountLog{
	private Integer id;//
	private String account;//
	private Integer teacherid;//
	private Integer status;//
	private String addby;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getAccount(){
		return this.account;
	}
	public void setAccount(String account){
		this.account=account;
	}
	public Integer getTeacherid(){
		return this.teacherid;
	}
	public void setTeacherid(Integer teacherid){
		this.teacherid=teacherid;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public String getAddby(){
		return this.addby;
	}
	public void setAddby(String addby){
		this.addby=addby;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}