package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class C_LiveRecord{
	private Integer id;//
	private Integer liveid;//
	private Integer targetid;//
	private Integer weekno;//
	private Integer minutes;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getLiveid(){
		return this.liveid;
	}
	public void setLiveid(Integer liveid){
		this.liveid=liveid;
	}
	public Integer getTargetid(){
		return this.targetid;
	}
	public void setTargetid(Integer targetid){
		this.targetid=targetid;
	}
	public Integer getWeekno(){
		return this.weekno;
	}
	public void setWeekno(Integer weekno){
		this.weekno=weekno;
	}
	public Integer getMinutes(){
		return this.minutes;
	}
	public void setMinutes(Integer minutes){
		this.minutes=minutes;
	}

}