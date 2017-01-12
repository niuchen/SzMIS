package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_CONDITION{
	private Integer id_condition;//
	private Integer id_condition_parent;//
	private String negated;//
	private String operator;//
	private String left_name;//
	private String condition_function;//
	private String right_name;//
	private Integer id_value_right;//

	public Integer getId_condition(){
		return this.id_condition;
	}
	public void setId_condition(Integer id_condition){
		this.id_condition=id_condition;
	}
	public Integer getId_condition_parent(){
		return this.id_condition_parent;
	}
	public void setId_condition_parent(Integer id_condition_parent){
		this.id_condition_parent=id_condition_parent;
	}
	public String getNegated(){
		return this.negated;
	}
	public void setNegated(String negated){
		this.negated=negated;
	}
	public String getOperator(){
		return this.operator;
	}
	public void setOperator(String operator){
		this.operator=operator;
	}
	public String getLeft_name(){
		return this.left_name;
	}
	public void setLeft_name(String left_name){
		this.left_name=left_name;
	}
	public String getCondition_function(){
		return this.condition_function;
	}
	public void setCondition_function(String condition_function){
		this.condition_function=condition_function;
	}
	public String getRight_name(){
		return this.right_name;
	}
	public void setRight_name(String right_name){
		this.right_name=right_name;
	}
	public Integer getId_value_right(){
		return this.id_value_right;
	}
	public void setId_value_right(Integer id_value_right){
		this.id_value_right=id_value_right;
	}

}