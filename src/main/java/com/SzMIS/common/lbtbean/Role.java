package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class Role{
	private Integer roleid;//
	private String rolename;//
	private String roledesc;//
	private Integer sort;//
	private Integer addby;//
	private String addtime;//
	private Integer platform;//
	private Integer state;//

	public Integer getRoleid(){
		return this.roleid;
	}
	public void setRoleid(Integer roleid){
		this.roleid=roleid;
	}
	public String getRolename(){
		return this.rolename;
	}
	public void setRolename(String rolename){
		this.rolename=rolename;
	}
	public String getRoledesc(){
		return this.roledesc;
	}
	public void setRoledesc(String roledesc){
		this.roledesc=roledesc;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort=sort;
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
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}

}