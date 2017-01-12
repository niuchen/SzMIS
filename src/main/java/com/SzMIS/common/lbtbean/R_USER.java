package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_USER{
	private Integer id_user;//
	private String login;//
	private String password;//
	private String name;//
	private String description;//
	private String enabled;//

	public Integer getId_user(){
		return this.id_user;
	}
	public void setId_user(Integer id_user){
		this.id_user=id_user;
	}
	public String getLogin(){
		return this.login;
	}
	public void setLogin(String login){
		this.login=login;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getEnabled(){
		return this.enabled;
	}
	public void setEnabled(String enabled){
		this.enabled=enabled;
	}

}