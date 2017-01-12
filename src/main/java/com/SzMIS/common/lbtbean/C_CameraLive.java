package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_CameraLive{
	private String cameraid;//
	private Integer openstate;//
	private Integer opentype;//
	private String addby;//
	private String addtime;//

	public String getCameraid(){
		return this.cameraid;
	}
	public void setCameraid(String cameraid){
		this.cameraid=cameraid;
	}
	public Integer getOpenstate(){
		return this.openstate;
	}
	public void setOpenstate(Integer openstate){
		this.openstate=openstate;
	}
	public Integer getOpentype(){
		return this.opentype;
	}
	public void setOpentype(Integer opentype){
		this.opentype=opentype;
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