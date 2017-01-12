package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_SLAVE{
	private Integer id_slave;//
	private String name;//
	private String host_name;//
	private String port;//
	private String username;//
	private String password;//
	private String proxy_host_name;//
	private String proxy_port;//
	private String non_proxy_hosts;//
	private String master;//
	private String web_app_name;//

	public Integer getId_slave(){
		return this.id_slave;
	}
	public void setId_slave(Integer id_slave){
		this.id_slave=id_slave;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getHost_name(){
		return this.host_name;
	}
	public void setHost_name(String host_name){
		this.host_name=host_name;
	}
	public String getPort(){
		return this.port;
	}
	public void setPort(String port){
		this.port=port;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getProxy_host_name(){
		return this.proxy_host_name;
	}
	public void setProxy_host_name(String proxy_host_name){
		this.proxy_host_name=proxy_host_name;
	}
	public String getProxy_port(){
		return this.proxy_port;
	}
	public void setProxy_port(String proxy_port){
		this.proxy_port=proxy_port;
	}
	public String getNon_proxy_hosts(){
		return this.non_proxy_hosts;
	}
	public void setNon_proxy_hosts(String non_proxy_hosts){
		this.non_proxy_hosts=non_proxy_hosts;
	}
	public String getMaster(){
		return this.master;
	}
	public void setMaster(String master){
		this.master=master;
	}
	public String getWeb_app_name(){
		return this.web_app_name;
	}
	public void setWeb_app_name(String web_app_name){
		this.web_app_name=web_app_name;
	}

}