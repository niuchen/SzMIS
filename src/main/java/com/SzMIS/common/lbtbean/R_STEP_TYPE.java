package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_STEP_TYPE{
	private Integer id_step_type;//
	private String code;//
	private String description;//
	private String helptext;//

	public Integer getId_step_type(){
		return this.id_step_type;
	}
	public void setId_step_type(Integer id_step_type){
		this.id_step_type=id_step_type;
	}
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getHelptext(){
		return this.helptext;
	}
	public void setHelptext(String helptext){
		this.helptext=helptext;
	}

}