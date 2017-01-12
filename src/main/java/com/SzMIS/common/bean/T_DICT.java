package com.SzMIS.common.bean;

	/**
	*	*@author niuchen2016-07-26 17:14:09
其他属性字典表	*/

	public class T_DICT{
	private String i_use;//是否在使用（1是0否）
	private Integer i_type;//属性类型(1资产来源，2年度属性，3站类型，4塔类型，5产品配置)
	private String v_name;//属性值

	public String getI_use(){
		return this.i_use;
	}
	public void setI_use(String i_use){
		this.i_use=i_use;
	}
	public Integer getI_type(){
		return this.i_type;
	}
	public void setI_type(Integer i_type){
		this.i_type=i_type;
	}
	public String getV_name(){
		return this.v_name;
	}
	public void setV_name(String v_name){
		this.v_name=v_name;
	}

}