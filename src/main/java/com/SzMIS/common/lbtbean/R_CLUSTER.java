package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_CLUSTER{
	private Integer id_cluster;//
	private String name;//
	private String base_port;//
	private String sockets_buffer_size;//
	private String sockets_flush_interval;//
	private String sockets_compressed;//
	private String dynamic_cluster;//

	public Integer getId_cluster(){
		return this.id_cluster;
	}
	public void setId_cluster(Integer id_cluster){
		this.id_cluster=id_cluster;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getBase_port(){
		return this.base_port;
	}
	public void setBase_port(String base_port){
		this.base_port=base_port;
	}
	public String getSockets_buffer_size(){
		return this.sockets_buffer_size;
	}
	public void setSockets_buffer_size(String sockets_buffer_size){
		this.sockets_buffer_size=sockets_buffer_size;
	}
	public String getSockets_flush_interval(){
		return this.sockets_flush_interval;
	}
	public void setSockets_flush_interval(String sockets_flush_interval){
		this.sockets_flush_interval=sockets_flush_interval;
	}
	public String getSockets_compressed(){
		return this.sockets_compressed;
	}
	public void setSockets_compressed(String sockets_compressed){
		this.sockets_compressed=sockets_compressed;
	}
	public String getDynamic_cluster(){
		return this.dynamic_cluster;
	}
	public void setDynamic_cluster(String dynamic_cluster){
		this.dynamic_cluster=dynamic_cluster;
	}

}