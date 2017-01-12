package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class LifeContent{
	private Integer typecontentid;//
	private Integer lifetypeid;//
	private String content;//
	private Integer isdefault;//
	private Integer eduunitid;//

	public Integer getTypecontentid(){
		return this.typecontentid;
	}
	public void setTypecontentid(Integer typecontentid){
		this.typecontentid=typecontentid;
	}
	public Integer getLifetypeid(){
		return this.lifetypeid;
	}
	public void setLifetypeid(Integer lifetypeid){
		this.lifetypeid=lifetypeid;
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
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}

}