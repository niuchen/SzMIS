package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_JOB_HOP{
	private Integer id_job_hop;//
	private Integer id_job;//
	private Integer id_jobentry_copy_from;//
	private Integer id_jobentry_copy_to;//
	private String enabled;//
	private String evaluation;//
	private String unconditional;//

	public Integer getId_job_hop(){
		return this.id_job_hop;
	}
	public void setId_job_hop(Integer id_job_hop){
		this.id_job_hop=id_job_hop;
	}
	public Integer getId_job(){
		return this.id_job;
	}
	public void setId_job(Integer id_job){
		this.id_job=id_job;
	}
	public Integer getId_jobentry_copy_from(){
		return this.id_jobentry_copy_from;
	}
	public void setId_jobentry_copy_from(Integer id_jobentry_copy_from){
		this.id_jobentry_copy_from=id_jobentry_copy_from;
	}
	public Integer getId_jobentry_copy_to(){
		return this.id_jobentry_copy_to;
	}
	public void setId_jobentry_copy_to(Integer id_jobentry_copy_to){
		this.id_jobentry_copy_to=id_jobentry_copy_to;
	}
	public String getEnabled(){
		return this.enabled;
	}
	public void setEnabled(String enabled){
		this.enabled=enabled;
	}
	public String getEvaluation(){
		return this.evaluation;
	}
	public void setEvaluation(String evaluation){
		this.evaluation=evaluation;
	}
	public String getUnconditional(){
		return this.unconditional;
	}
	public void setUnconditional(String unconditional){
		this.unconditional=unconditional;
	}

}