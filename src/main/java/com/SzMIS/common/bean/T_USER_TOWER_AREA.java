package com.SzMIS.common.bean;

	/**
	*	*@author niuchen2016-07-26 17:14:05
用户铁塔区域表	*/

	public class T_USER_TOWER_AREA{
	private Integer i_area_id;//区域ID
	private Integer i_user_id;//用户ID

	public Integer getI_area_id(){
		return this.i_area_id;
	}
	public void setI_area_id(Integer i_area_id){
		this.i_area_id=i_area_id;
	}
	public Integer getI_user_id(){
		return this.i_user_id;
	}
	public void setI_user_id(Integer i_user_id){
		this.i_user_id=i_user_id;
	}

}