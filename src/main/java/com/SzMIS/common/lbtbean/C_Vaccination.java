package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_Vaccination{
	private Integer id;//
	private Integer userid;//
	private Integer vaccineid;//
	private String vaccinetime;//

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
	public Integer getVaccineid(){
		return this.vaccineid;
	}
	public void setVaccineid(Integer vaccineid){
		this.vaccineid=vaccineid;
	}
	public String getVaccinetime(){
		return this.vaccinetime;
	}
	public void setVaccinetime(String vaccinetime){
		this.vaccinetime=vaccinetime;
	}

}