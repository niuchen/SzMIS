package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_DATABASE_ATTRIBUTE{
	private Integer id_database_attribute;//
	private Integer id_database;//
	private String code;//
	private String value_str;//

	public Integer getId_database_attribute(){
		return this.id_database_attribute;
	}
	public void setId_database_attribute(Integer id_database_attribute){
		this.id_database_attribute=id_database_attribute;
	}
	public Integer getId_database(){
		return this.id_database;
	}
	public void setId_database(Integer id_database){
		this.id_database=id_database;
	}
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getValue_str(){
		return this.value_str;
	}
	public void setValue_str(String value_str){
		this.value_str=value_str;
	}

}