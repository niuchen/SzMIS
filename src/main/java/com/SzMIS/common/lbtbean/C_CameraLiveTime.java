package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class C_CameraLiveTime{
	private Integer id;//
	private String cameraid;//
	private String begintime;//
	private String endtime;//
	private String addby;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getCameraid(){
		return this.cameraid;
	}
	public void setCameraid(String cameraid){
		this.cameraid=cameraid;
	}
	public String getBegintime(){
		return this.begintime;
	}
	public void setBegintime(String begintime){
		this.begintime=begintime;
	}
	public String getEndtime(){
		return this.endtime;
	}
	public void setEndtime(String endtime){
		this.endtime=endtime;
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