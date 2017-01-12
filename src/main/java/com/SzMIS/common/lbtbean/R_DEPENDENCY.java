package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_DEPENDENCY{
	private Integer id_dependency;//
	private Integer id_transformation;//
	private Integer id_database;//
	private String table_name;//
	private String field_name;//

	public Integer getId_dependency(){
		return this.id_dependency;
	}
	public void setId_dependency(Integer id_dependency){
		this.id_dependency=id_dependency;
	}
	public Integer getId_transformation(){
		return this.id_transformation;
	}
	public void setId_transformation(Integer id_transformation){
		this.id_transformation=id_transformation;
	}
	public Integer getId_database(){
		return this.id_database;
	}
	public void setId_database(Integer id_database){
		this.id_database=id_database;
	}
	public String getTable_name(){
		return this.table_name;
	}
	public void setTable_name(String table_name){
		this.table_name=table_name;
	}
	public String getField_name(){
		return this.field_name;
	}
	public void setField_name(String field_name){
		this.field_name=field_name;
	}

}