package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Keywords{
	private Integer keywordsid;//
	private String keywordsname;//
	private Integer schoolid;//
	private String addby;//
	private String addtime;//
	private Integer status;//

	public Integer getKeywordsid(){
		return this.keywordsid;
	}
	public void setKeywordsid(Integer keywordsid){
		this.keywordsid=keywordsid;
	}
	public String getKeywordsname(){
		return this.keywordsname;
	}
	public void setKeywordsname(String keywordsname){
		this.keywordsname=keywordsname;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
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
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}