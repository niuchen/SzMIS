package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_JOB_LOCK{
	private Integer id_job_lock;//
	private Integer id_job;//
	private Integer id_user;//
	private String lock_message;//
	private String lock_date;//

	public Integer getId_job_lock(){
		return this.id_job_lock;
	}
	public void setId_job_lock(Integer id_job_lock){
		this.id_job_lock=id_job_lock;
	}
	public Integer getId_job(){
		return this.id_job;
	}
	public void setId_job(Integer id_job){
		this.id_job=id_job;
	}
	public Integer getId_user(){
		return this.id_user;
	}
	public void setId_user(Integer id_user){
		this.id_user=id_user;
	}
	public String getLock_message(){
		return this.lock_message;
	}
	public void setLock_message(String lock_message){
		this.lock_message=lock_message;
	}
	public String getLock_date(){
		return this.lock_date;
	}
	public void setLock_date(String lock_date){
		this.lock_date=lock_date;
	}

}