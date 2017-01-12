package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class R_REPOSITORY_LOG{
	private Integer id_repository_log;//
	private String rep_version;//
	private String log_date;//
	private String log_user;//
	private String operation_desc;//

	public Integer getId_repository_log(){
		return this.id_repository_log;
	}
	public void setId_repository_log(Integer id_repository_log){
		this.id_repository_log=id_repository_log;
	}
	public String getRep_version(){
		return this.rep_version;
	}
	public void setRep_version(String rep_version){
		this.rep_version=rep_version;
	}
	public String getLog_date(){
		return this.log_date;
	}
	public void setLog_date(String log_date){
		this.log_date=log_date;
	}
	public String getLog_user(){
		return this.log_user;
	}
	public void setLog_user(String log_user){
		this.log_user=log_user;
	}
	public String getOperation_desc(){
		return this.operation_desc;
	}
	public void setOperation_desc(String operation_desc){
		this.operation_desc=operation_desc;
	}

}