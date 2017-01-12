package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_DATABASE{
	private Integer id_database;//
	private String name;//
	private Integer id_database_type;//
	private Integer id_database_contype;//
	private String host_name;//
	private String database_name;//
	private Integer port;//
	private String username;//
	private String password;//
	private String servername;//
	private String data_tbs;//
	private String index_tbs;//

	public Integer getId_database(){
		return this.id_database;
	}
	public void setId_database(Integer id_database){
		this.id_database=id_database;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Integer getId_database_type(){
		return this.id_database_type;
	}
	public void setId_database_type(Integer id_database_type){
		this.id_database_type=id_database_type;
	}
	public Integer getId_database_contype(){
		return this.id_database_contype;
	}
	public void setId_database_contype(Integer id_database_contype){
		this.id_database_contype=id_database_contype;
	}
	public String getHost_name(){
		return this.host_name;
	}
	public void setHost_name(String host_name){
		this.host_name=host_name;
	}
	public String getDatabase_name(){
		return this.database_name;
	}
	public void setDatabase_name(String database_name){
		this.database_name=database_name;
	}
	public Integer getPort(){
		return this.port;
	}
	public void setPort(Integer port){
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
	public String getServername(){
		return this.servername;
	}
	public void setServername(String servername){
		this.servername=servername;
	}
	public String getData_tbs(){
		return this.data_tbs;
	}
	public void setData_tbs(String data_tbs){
		this.data_tbs=data_tbs;
	}
	public String getIndex_tbs(){
		return this.index_tbs;
	}
	public void setIndex_tbs(String index_tbs){
		this.index_tbs=index_tbs;
	}

}