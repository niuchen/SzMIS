package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_JOBENTRY{
	private Integer id_jobentry;//
	private Integer id_job;//
	private Integer id_jobentry_type;//
	private String name;//
	private String description;//

	public Integer getId_jobentry(){
		return this.id_jobentry;
	}
	public void setId_jobentry(Integer id_jobentry){
		this.id_jobentry=id_jobentry;
	}
	public Integer getId_job(){
		return this.id_job;
	}
	public void setId_job(Integer id_job){
		this.id_job=id_job;
	}
	public Integer getId_jobentry_type(){
		return this.id_jobentry_type;
	}
	public void setId_jobentry_type(Integer id_jobentry_type){
		this.id_jobentry_type=id_jobentry_type;
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

}