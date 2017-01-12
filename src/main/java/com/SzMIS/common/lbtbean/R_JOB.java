package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_JOB{
	private Integer id_job;//
	private Integer id_directory;//
	private String name;//
	private String description;//
	private String extended_description;//
	private String job_version;//
	private Integer job_status;//
	private Integer id_database_log;//
	private String table_name_log;//
	private String created_user;//
	private String created_date;//
	private String modified_user;//
	private String modified_date;//
	private String use_batch_id;//
	private String pass_batch_id;//
	private String use_logfield;//
	private String shared_file;//

	public Integer getId_job(){
		return this.id_job;
	}
	public void setId_job(Integer id_job){
		this.id_job=id_job;
	}
	public Integer getId_directory(){
		return this.id_directory;
	}
	public void setId_directory(Integer id_directory){
		this.id_directory=id_directory;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getExtended_description(){
		return this.extended_description;
	}
	public void setExtended_description(String extended_description){
		this.extended_description=extended_description;
	}
	public String getJob_version(){
		return this.job_version;
	}
	public void setJob_version(String job_version){
		this.job_version=job_version;
	}
	public Integer getJob_status(){
		return this.job_status;
	}
	public void setJob_status(Integer job_status){
		this.job_status=job_status;
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
	public String getCreated_user(){
		return this.created_user;
	}
	public void setCreated_user(String created_user){
		this.created_user=created_user;
	}
	public String getCreated_date(){
		return this.created_date;
	}
	public void setCreated_date(String created_date){
		this.created_date=created_date;
	}
	public String getModified_user(){
		return this.modified_user;
	}
	public void setModified_user(String modified_user){
		this.modified_user=modified_user;
	}
	public String getModified_date(){
		return this.modified_date;
	}
	public void setModified_date(String modified_date){
		this.modified_date=modified_date;
	}
	public String getUse_batch_id(){
		return this.use_batch_id;
	}
	public void setUse_batch_id(String use_batch_id){
		this.use_batch_id=use_batch_id;
	}
	public String getPass_batch_id(){
		return this.pass_batch_id;
	}
	public void setPass_batch_id(String pass_batch_id){
		this.pass_batch_id=pass_batch_id;
	}
	public String getUse_logfield(){
		return this.use_logfield;
	}
	public void setUse_logfield(String use_logfield){
		this.use_logfield=use_logfield;
	}
	public String getShared_file(){
		return this.shared_file;
	}
	public void setShared_file(String shared_file){
		this.shared_file=shared_file;
	}

}