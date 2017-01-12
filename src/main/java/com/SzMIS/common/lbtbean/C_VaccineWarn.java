package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_VaccineWarn{
	private Integer userid;//
	private Integer warntime;//
	private Integer iswarning;//
	private String addtime;//

	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public Integer getWarntime(){
		return this.warntime;
	}
	public void setWarntime(Integer warntime){
		this.warntime=warntime;
	}
	public Integer getIswarning(){
		return this.iswarning;
	}
	public void setIswarning(Integer iswarning){
		this.iswarning=iswarning;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}