package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_VALUE{
	private Integer id_value;//
	private String name;//
	private String value_type;//
	private String value_str;//
	private String is_null;//

	public Integer getId_value(){
		return this.id_value;
	}
	public void setId_value(Integer id_value){
		this.id_value=id_value;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getValue_type(){
		return this.value_type;
	}
	public void setValue_type(String value_type){
		this.value_type=value_type;
	}
	public String getValue_str(){
		return this.value_str;
	}
	public void setValue_str(String value_str){
		this.value_str=value_str;
	}
	public String getIs_null(){
		return this.is_null;
	}
	public void setIs_null(String is_null){
		this.is_null=is_null;
	}

}