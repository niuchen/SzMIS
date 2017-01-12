package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class C_Trigger{
	private String triggerid;//
	private Integer type;//
	private Integer pvid;//
	private String beforekey;//
	private String afterkey;//
	private String command;//
	private String optime;//
	private Integer opuserid;//
	private Integer state;//

	public String getTriggerid(){
		return this.triggerid;
	}
	public void setTriggerid(String triggerid){
		this.triggerid=triggerid;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getPvid(){
		return this.pvid;
	}
	public void setPvid(Integer pvid){
		this.pvid=pvid;
	}
	public String getBeforekey(){
		return this.beforekey;
	}
	public void setBeforekey(String beforekey){
		this.beforekey=beforekey;
	}
	public String getAfterkey(){
		return this.afterkey;
	}
	public void setAfterkey(String afterkey){
		this.afterkey=afterkey;
	}
	public String getCommand(){
		return this.command;
	}
	public void setCommand(String command){
		this.command=command;
	}
	public String getOptime(){
		return this.optime;
	}
	public void setOptime(String optime){
		this.optime=optime;
	}
	public Integer getOpuserid(){
		return this.opuserid;
	}
	public void setOpuserid(Integer opuserid){
		this.opuserid=opuserid;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}

}