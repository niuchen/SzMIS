package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class BusLineUsers{
	private Integer id;//
	private Integer buslineid;//
	private Integer userid;//
	private Integer usertype;//
	private String username;//
	private String updatetime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getBuslineid(){
		return this.buslineid;
	}
	public void setBuslineid(Integer buslineid){
		this.buslineid=buslineid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getUpdatetime(){
		return this.updatetime;
	}
	public void setUpdatetime(String updatetime){
		this.updatetime=updatetime;
	}

}