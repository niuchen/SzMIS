package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class VaccineType{
	private Integer vaccineid;//
	private String vaccinename;//
	private Integer addby;//
	private String addtime;//

	public Integer getVaccineid(){
		return this.vaccineid;
	}
	public void setVaccineid(Integer vaccineid){
		this.vaccineid=vaccineid;
	}
	public String getVaccinename(){
		return this.vaccinename;
	}
	public void setVaccinename(String vaccinename){
		this.vaccinename=vaccinename;
	}
	public Integer getAddby(){
		return this.addby;
	}
	public void setAddby(Integer addby){
		this.addby=addby;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}