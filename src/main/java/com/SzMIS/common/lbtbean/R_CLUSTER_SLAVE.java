package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_CLUSTER_SLAVE{
	private Integer id_cluster_slave;//
	private Integer id_cluster;//
	private Integer id_slave;//

	public Integer getId_cluster_slave(){
		return this.id_cluster_slave;
	}
	public void setId_cluster_slave(Integer id_cluster_slave){
		this.id_cluster_slave=id_cluster_slave;
	}
	public Integer getId_cluster(){
		return this.id_cluster;
	}
	public void setId_cluster(Integer id_cluster){
		this.id_cluster=id_cluster;
	}
	public Integer getId_slave(){
		return this.id_slave;
	}
	public void setId_slave(Integer id_slave){
		this.id_slave=id_slave;
	}

}