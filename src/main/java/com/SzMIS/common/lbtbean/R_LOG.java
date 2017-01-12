package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_LOG{
	private Integer id_log;//
	private String name;//
	private Integer id_loglevel;//
	private String logtype;//
	private String filename;//
	private String fileextention;//
	private String add_date;//
	private String add_time;//
	private Integer id_database_log;//
	private String table_name_log;//

	public Integer getId_log(){
		return this.id_log;
	}
	public void setId_log(Integer id_log){
		this.id_log=id_log;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Integer getId_loglevel(){
		return this.id_loglevel;
	}
	public void setId_loglevel(Integer id_loglevel){
		this.id_loglevel=id_loglevel;
	}
	public String getLogtype(){
		return this.logtype;
	}
	public void setLogtype(String logtype){
		this.logtype=logtype;
	}
	public String getFilename(){
		return this.filename;
	}
	public void setFilename(String filename){
		this.filename=filename;
	}
	public String getFileextention(){
		return this.fileextention;
	}
	public void setFileextention(String fileextention){
		this.fileextention=fileextention;
	}
	public String getAdd_date(){
		return this.add_date;
	}
	public void setAdd_date(String add_date){
		this.add_date=add_date;
	}
	public String getAdd_time(){
		return this.add_time;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public Integer getId_database_log(){
		return this.id_database_log;
	}
	public void setId_database_log(Integer id_database_log){
		this.id_database_log=id_database_log;
	}
	public String getTable_name_log(){
		return this.table_name_log;
	}
	public void setTable_name_log(String table_name_log){
		this.table_name_log=table_name_log;
	}

}