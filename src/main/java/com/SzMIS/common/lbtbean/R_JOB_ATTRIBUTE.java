package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_JOB_ATTRIBUTE{
	private Integer id_job_attribute;//
	private Integer id_job;//
	private Integer nr;//
	private String code;//
	private Integer value_num;//
	private String value_str;//

	public Integer getId_job_attribute(){
		return this.id_job_attribute;
	}
	public void setId_job_attribute(Integer id_job_attribute){
		this.id_job_attribute=id_job_attribute;
	}
	public Integer getId_job(){
		return this.id_job;
	}
	public void setId_job(Integer id_job){
		this.id_job=id_job;
	}
	public Integer getNr(){
		return this.nr;
	}
	public void setNr(Integer nr){
		this.nr=nr;
	}
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public Integer getValue_num(){
		return this.value_num;
	}
	public void setValue_num(Integer value_num){
		this.value_num=value_num;
	}
	public String getValue_str(){
		return this.value_str;
	}
	public void setValue_str(String value_str){
		this.value_str=value_str;
	}

}