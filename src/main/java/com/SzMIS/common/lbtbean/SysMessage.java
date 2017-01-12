package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class SysMessage{
	private Integer sysmessageid;//
	private String content;//
	private Integer isdefault;//
	private Integer type;//

	public Integer getSysmessageid(){
		return this.sysmessageid;
	}
	public void setSysmessageid(Integer sysmessageid){
		this.sysmessageid=sysmessageid;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public Integer getIsdefault(){
		return this.isdefault;
	}
	public void setIsdefault(Integer isdefault){
		this.isdefault=isdefault;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}

}