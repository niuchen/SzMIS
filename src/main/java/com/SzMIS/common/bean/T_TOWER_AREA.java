package com.SzMIS.common.bean;

	/**
	*	*@author niuchen2016-07-26 17:14:07
铁塔区域表	*/

	public class T_TOWER_AREA{
	private String i_use;//是否在使用（1是0否）
	private Integer i_city_id;//归属地市ID
	private String v_tower_area_name;//铁塔区域名称
	private Integer i_tower_area_id;//铁塔区域ID(自增长)

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
	public String getV_tower_area_name(){
		return this.v_tower_area_name;
	}
	public void setV_tower_area_name(String v_tower_area_name){
		this.v_tower_area_name=v_tower_area_name;
	}
	public Integer getI_tower_area_id(){
		return this.i_tower_area_id;
	}
	public void setI_tower_area_id(Integer i_tower_area_id){
		this.i_tower_area_id=i_tower_area_id;
	}

}