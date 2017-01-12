package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_TRANS_STEP_CONDITION{
	private Integer id_transformation;//
	private Integer id_step;//
	private Integer id_condition;//

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
	public Integer getId_condition(){
		return this.id_condition;
	}
	public void setId_condition(Integer id_condition){
		this.id_condition=id_condition;
	}

}