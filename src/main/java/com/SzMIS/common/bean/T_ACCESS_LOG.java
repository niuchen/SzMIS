package com.SzMIS.common.bean;

	/**
	*	*@author niuchen2016-07-26 17:14:10
null	*/

	public class T_ACCESS_LOG{
	private Integer i_enterprise_no;//
	private Integer i_access_mode;//
	private String m_file_name;//
	private String insert_time;//
	private Integer m_id;//
	private Integer i_user_id;//
	private Integer id;//

	public Integer getI_enterprise_no(){
		return this.i_enterprise_no;
	}
	public void setI_enterprise_no(Integer i_enterprise_no){
		this.i_enterprise_no=i_enterprise_no;
	}
	public Integer getI_access_mode(){
		return this.i_access_mode;
	}
	public void setI_access_mode(Integer i_access_mode){
		this.i_access_mode=i_access_mode;
	}
	public String getM_file_name(){
		return this.m_file_name;
	}
	public void setM_file_name(String m_file_name){
		this.m_file_name=m_file_name;
	}
	public String getInsert_time(){
		return this.insert_time;
	}
	public void setInsert_time(String insert_time){
		this.insert_time=insert_time;
	}
	public Integer getM_id(){
		return this.m_id;
	}
	public void setM_id(Integer m_id){
		this.m_id=m_id;
	}
	public Integer getI_user_id(){
		return this.i_user_id;
	}
	public void setI_user_id(Integer i_user_id){
		this.i_user_id=i_user_id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}

}