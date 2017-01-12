package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class SmsTemp{
	private Integer smstempid;//
	private Integer typeid;//
	private String content;//
	private Integer addby;//
	private String addtime;//
	private Integer istemp;//
	private Integer isanonym;//

	public Integer getSmstempid(){
		return this.smstempid;
	}
	public void setSmstempid(Integer smstempid){
		this.smstempid=smstempid;
	}
	public Integer getTypeid(){
		return this.typeid;
	}
	public void setTypeid(Integer typeid){
		this.typeid=typeid;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
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
	public Integer getIstemp(){
		return this.istemp;
	}
	public void setIstemp(Integer istemp){
		this.istemp=istemp;
	}
	public Integer getIsanonym(){
		return this.isanonym;
	}
	public void setIsanonym(Integer isanonym){
		this.isanonym=isanonym;
	}

}