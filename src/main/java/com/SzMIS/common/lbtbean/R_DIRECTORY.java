package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_DIRECTORY{
	private Integer id_directory;//
	private Integer id_directory_parent;//
	private String directory_name;//

	public Integer getId_directory(){
		return this.id_directory;
	}
	public void setId_directory(Integer id_directory){
		this.id_directory=id_directory;
	}
	public Integer getId_directory_parent(){
		return this.id_directory_parent;
	}
	public void setId_directory_parent(Integer id_directory_parent){
		this.id_directory_parent=id_directory_parent;
	}
	public String getDirectory_name(){
		return this.directory_name;
	}
	public void setDirectory_name(String directory_name){
		this.directory_name=directory_name;
	}

}