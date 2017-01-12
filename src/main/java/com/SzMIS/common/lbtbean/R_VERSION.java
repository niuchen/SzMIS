package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class R_VERSION{
	private Integer id_version;//
	private Integer major_version;//
	private Integer minor_version;//
	private String upgrade_date;//
	private String is_upgrade;//

	public Integer getId_version(){
		return this.id_version;
	}
	public void setId_version(Integer id_version){
		this.id_version=id_version;
	}
	public Integer getMajor_version(){
		return this.major_version;
	}
	public void setMajor_version(Integer major_version){
		this.major_version=major_version;
	}
	public Integer getMinor_version(){
		return this.minor_version;
	}
	public void setMinor_version(Integer minor_version){
		this.minor_version=minor_version;
	}
	public String getUpgrade_date(){
		return this.upgrade_date;
	}
	public void setUpgrade_date(String upgrade_date){
		this.upgrade_date=upgrade_date;
	}
	public String getIs_upgrade(){
		return this.is_upgrade;
	}
	public void setIs_upgrade(String is_upgrade){
		this.is_upgrade=is_upgrade;
	}

}