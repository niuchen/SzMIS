package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Errorlog{
	private String appname;//
	private String logtime;//
	private String loglevel;//
	private String loginfo;//
	private String inserttime;//

	public String getAppname(){
		return this.appname;
	}
	public void setAppname(String appname){
		this.appname=appname;
	}
	public String getLogtime(){
		return this.logtime;
	}
	public void setLogtime(String logtime){
		this.logtime=logtime;
	}
	public String getLoglevel(){
		return this.loglevel;
	}
	public void setLoglevel(String loglevel){
		this.loglevel=loglevel;
	}
	public String getLoginfo(){
		return this.loginfo;
	}
	public void setLoginfo(String loginfo){
		this.loginfo=loginfo;
	}
	public String getInserttime(){
		return this.inserttime;
	}
	public void setInserttime(String inserttime){
		this.inserttime=inserttime;
	}

}