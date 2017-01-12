package com.SzMIS.common.bean;

	/**
	*	*@author niuchen2016-07-26 17:14:05
null	*/

	public class T_USER_LOGIN_LOG{
	private Integer i_enterprise_no;//
	private Integer i_landing_approach;//
	private String dtm_logout_time;//
	private String dtm_login_time;//
	private Integer i_user_id;//
	private Integer id;//

	public Integer getI_enterprise_no(){
		return this.i_enterprise_no;
	}
	public void setI_enterprise_no(Integer i_enterprise_no){
		this.i_enterprise_no=i_enterprise_no;
	}
	public Integer getI_landing_approach(){
		return this.i_landing_approach;
	}
	public void setI_landing_approach(Integer i_landing_approach){
		this.i_landing_approach=i_landing_approach;
	}
	public String getDtm_logout_time(){
		return this.dtm_logout_time;
	}
	public void setDtm_logout_time(String dtm_logout_time){
		this.dtm_logout_time=dtm_logout_time;
	}
	public String getDtm_login_time(){
		return this.dtm_login_time;
	}
	public void setDtm_login_time(String dtm_login_time){
		this.dtm_login_time=dtm_login_time;
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