package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class AttendanceConfig{
	private Integer id;//
	private Integer schoolid;//
	private Integer eduunitid;//
	private Integer usersid;//
	private Integer roleid;//
	private String receivetime;//
	private Integer isreceive;//
	private Integer addby;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public Integer getEduunitid(){
		return this.eduunitid;
	}
	public void setEduunitid(Integer eduunitid){
		this.eduunitid=eduunitid;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public Integer getRoleid(){
		return this.roleid;
	}
	public void setRoleid(Integer roleid){
		this.roleid=roleid;
	}
	public String getReceivetime(){
		return this.receivetime;
	}
	public void setReceivetime(String receivetime){
		this.receivetime=receivetime;
	}
	public Integer getIsreceive(){
		return this.isreceive;
	}
	public void setIsreceive(Integer isreceive){
		this.isreceive=isreceive;
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