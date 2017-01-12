package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_PARTITION{
	private Integer id_partition;//
	private Integer id_partition_schema;//
	private String partition_id;//

	public Integer getId_partition(){
		return this.id_partition;
	}
	public void setId_partition(Integer id_partition){
		this.id_partition=id_partition;
	}
	public Integer getId_partition_schema(){
		return this.id_partition_schema;
	}
	public void setId_partition_schema(Integer id_partition_schema){
		this.id_partition_schema=id_partition_schema;
	}
	public String getPartition_id(){
		return this.partition_id;
	}
	public void setPartition_id(String partition_id){
		this.partition_id=partition_id;
	}

}