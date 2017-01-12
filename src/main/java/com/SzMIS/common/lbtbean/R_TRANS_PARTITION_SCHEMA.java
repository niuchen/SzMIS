package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_TRANS_PARTITION_SCHEMA{
	private Integer id_trans_partition_schema;//
	private Integer id_transformation;//
	private Integer id_partition_schema;//

	public Integer getId_trans_partition_schema(){
		return this.id_trans_partition_schema;
	}
	public void setId_trans_partition_schema(Integer id_trans_partition_schema){
		this.id_trans_partition_schema=id_trans_partition_schema;
	}
	public Integer getId_transformation(){
		return this.id_transformation;
	}
	public void setId_transformation(Integer id_transformation){
		this.id_transformation=id_transformation;
	}
	public Integer getId_partition_schema(){
		return this.id_partition_schema;
	}
	public void setId_partition_schema(Integer id_partition_schema){
		this.id_partition_schema=id_partition_schema;
	}

}