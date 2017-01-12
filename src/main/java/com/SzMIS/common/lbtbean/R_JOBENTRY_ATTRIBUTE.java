package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_JOBENTRY_ATTRIBUTE{
	private Integer id_jobentry_attribute;//
	private Integer id_job;//
	private Integer id_jobentry;//
	private Integer nr;//
	private String code;//
	private String value_num;//
	private String value_str;//

	public Integer getId_jobentry_attribute(){
		return this.id_jobentry_attribute;
	}
	public void setId_jobentry_attribute(Integer id_jobentry_attribute){
		this.id_jobentry_attribute=id_jobentry_attribute;
	}
	public Integer getId_job(){
		return this.id_job;
	}
	public void setId_job(Integer id_job){
		this.id_job=id_job;
	}
	public Integer getId_jobentry(){
		return this.id_jobentry;
	}
	public void setId_jobentry(Integer id_jobentry){
		this.id_jobentry=id_jobentry;
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
	public String getValue_num(){
		return this.value_num;
	}
	public void setValue_num(String value_num){
		this.value_num=value_num;
	}
	public String getValue_str(){
		return this.value_str;
	}
	public void setValue_str(String value_str){
		this.value_str=value_str;
	}

}