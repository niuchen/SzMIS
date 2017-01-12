package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class Cooperation{
	private Integer id;//
	private String schoolname;//
	private String contactname;//
	private String phone;//
	private String role;//
	private String scale;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getSchoolname(){
		return this.schoolname;
	}
	public void setSchoolname(String schoolname){
		this.schoolname=schoolname;
	}
	public String getContactname(){
		return this.contactname;
	}
	public void setContactname(String contactname){
		this.contactname=contactname;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getRole(){
		return this.role;
	}
	public void setRole(String role){
		this.role=role;
	}
	public String getScale(){
		return this.scale;
	}
	public void setScale(String scale){
		this.scale=scale;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}