package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_TRANS_HOP{
	private Integer id_trans_hop;//
	private Integer id_transformation;//
	private Integer id_step_from;//
	private Integer id_step_to;//
	private String enabled;//

	public Integer getId_trans_hop(){
		return this.id_trans_hop;
	}
	public void setId_trans_hop(Integer id_trans_hop){
		this.id_trans_hop=id_trans_hop;
	}
	public Integer getId_transformation(){
		return this.id_transformation;
	}
	public void setId_transformation(Integer id_transformation){
		this.id_transformation=id_transformation;
	}
	public Integer getId_step_from(){
		return this.id_step_from;
	}
	public void setId_step_from(Integer id_step_from){
		this.id_step_from=id_step_from;
	}
	public Integer getId_step_to(){
		return this.id_step_to;
	}
	public void setId_step_to(Integer id_step_to){
		this.id_step_to=id_step_to;
	}
	public String getEnabled(){
		return this.enabled;
	}
	public void setEnabled(String enabled){
		this.enabled=enabled;
	}

}