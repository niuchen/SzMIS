package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_STEP_ATTRIBUTE{
	private Integer id_step_attribute;//
	private Integer id_transformation;//
	private Integer id_step;//
	private Integer nr;//
	private String code;//
	private Integer value_num;//
	private String value_str;//

	public Integer getId_step_attribute(){
		return this.id_step_attribute;
	}
	public void setId_step_attribute(Integer id_step_attribute){
		this.id_step_attribute=id_step_attribute;
	}
	public Integer getId_transformation(){
		return this.id_transformation;
	}
	public void setId_transformation(Integer id_transformation){
		this.id_transformation=id_transformation;
	}
	public Integer getId_step(){
		return this.id_step;
	}
	public void setId_step(Integer id_step){
		this.id_step=id_step;
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