package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_PARTITION_SCHEMA{
	private Integer id_partition_schema;//
	private String name;//
	private String dynamic_definition;//
	private String partitions_per_slave;//

	public Integer getId_partition_schema(){
		return this.id_partition_schema;
	}
	public void setId_partition_schema(Integer id_partition_schema){
		this.id_partition_schema=id_partition_schema;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDynamic_definition(){
		return this.dynamic_definition;
	}
	public void setDynamic_definition(String dynamic_definition){
		this.dynamic_definition=dynamic_definition;
	}
	public String getPartitions_per_slave(){
		return this.partitions_per_slave;
	}
	public void setPartitions_per_slave(String partitions_per_slave){
		this.partitions_per_slave=partitions_per_slave;
	}

}