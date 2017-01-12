package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class B_PhotoPool{
	private Integer id;//
	private Integer userid;//
	private String photopath;//
	private String description;//
	private String shoottime;//
	private Integer photoid;//
	private Integer source;//
	private Integer status;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public String getPhotopath(){
		return this.photopath;
	}
	public void setPhotopath(String photopath){
		this.photopath=photopath;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getShoottime(){
		return this.shoottime;
	}
	public void setShoottime(String shoottime){
		this.shoottime=shoottime;
	}
	public Integer getPhotoid(){
		return this.photoid;
	}
	public void setPhotoid(Integer photoid){
		this.photoid=photoid;
	}
	public Integer getSource(){
		return this.source;
	}
	public void setSource(Integer source){
		this.source=source;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}