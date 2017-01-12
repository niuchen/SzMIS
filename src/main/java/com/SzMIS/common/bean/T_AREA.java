package com.SzMIS.common.bean;

	/**
	*	*@author niuchen2016-07-26 17:14:10
区域字典表	*/

	public class T_AREA{
	private String i_use;//是否在使用（1是 0否）
	private Integer i_city_id;//归属地市ID（关联地市表ID）
	private String v_area_name;//区域名称
	private Integer i_area_id;//区域ID

	public String getI_use(){
		return this.i_use;
	}
	public void setI_use(String i_use){
		this.i_use=i_use;
	}
	public Integer getI_city_id(){
		return this.i_city_id;
	}
	public void setI_city_id(Integer i_city_id){
		this.i_city_id=i_city_id;
	}
	public String getV_area_name(){
		return this.v_area_name;
	}
	public void setV_area_name(String v_area_name){
		this.v_area_name=v_area_name;
	}
	public Integer getI_area_id(){
		return this.i_area_id;
	}
	public void setI_area_id(Integer i_area_id){
		this.i_area_id=i_area_id;
	}

}