package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class Vaccination{
	private Integer id;//
	private Integer userid;//
	private String vaccinedate;//
	private Integer vaccineid;//
	private String description;//
	private Integer addby;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public String getVaccinedate(){
		return this.vaccinedate;
	}
	public void setVaccinedate(String vaccinedate){
		this.vaccinedate=vaccinedate;
	}
	public Integer getVaccineid(){
		return this.vaccineid;
	}
	public void setVaccineid(Integer vaccineid){
		this.vaccineid=vaccineid;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
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