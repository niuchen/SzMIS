package com.SzMIS.common.bean;

	/**
	*	*@author niuchen2016-07-26 17:14:09
地市字典表	*/

	public class T_CITY{
	private String v_benchmarking;//对标地市ID(集合，多个地市ID用半角逗号隔开)
	private String v_city_name;//地市名称
	private Integer i_city_id;//地市ID

	public String getV_benchmarking(){
		return this.v_benchmarking;
	}
	public void setV_benchmarking(String v_benchmarking){
		this.v_benchmarking=v_benchmarking;
	}
	public String getV_city_name(){
		return this.v_city_name;
	}
	public void setV_city_name(String v_city_name){
		this.v_city_name=v_city_name;
	}
	public Integer getI_city_id(){
		return this.i_city_id;
	}
	public void setI_city_id(Integer i_city_id){
		this.i_city_id=i_city_id;
	}

}