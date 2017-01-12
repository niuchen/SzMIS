package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_TRANS_LOCK{
	private Integer id_trans_lock;//
	private Integer id_transformation;//
	private Integer id_user;//
	private String lock_message;//
	private String lock_date;//

	public Integer getId_trans_lock(){
		return this.id_trans_lock;
	}
	public void setId_trans_lock(Integer id_trans_lock){
		this.id_trans_lock=id_trans_lock;
	}
	public Integer getId_transformation(){
		return this.id_transformation;
	}
	public void setId_transformation(Integer id_transformation){
		this.id_transformation=id_transformation;
	}
	public Integer getId_user(){
		return this.id_user;
	}
	public void setId_user(Integer id_user){
		this.id_user=id_user;
	}
	public String getLock_message(){
		return this.lock_message;
	}
	public void setLock_message(String lock_message){
		this.lock_message=lock_message;
	}
	public String getLock_date(){
		return this.lock_date;
	}
	public void setLock_date(String lock_date){
		this.lock_date=lock_date;
	}

}