package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class C_VaccineWarnTemp{
	private Integer id;//
	private Integer userid;//
	private String username;//
	private String vaccinedate;//
	private String vaccinename;//
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
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getVaccinedate(){
		return this.vaccinedate;
	}
	public void setVaccinedate(String vaccinedate){
		this.vaccinedate=vaccinedate;
	}
	public String getVaccinename(){
		return this.vaccinename;
	}
	public void setVaccinename(String vaccinename){
		this.vaccinename=vaccinename;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}