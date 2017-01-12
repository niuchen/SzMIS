package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class EduResources{
	private Integer id;//
	private String name;//
	private String description;//
	private Integer type;//
	private String path;//
	private Integer schoolid;//
	private Integer isopen;//
	private Integer addby;//
	private String addtime;//
	private Integer platform;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public String getPath(){
		return this.path;
	}
	public void setPath(String path){
		this.path=path;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public Integer getIsopen(){
		return this.isopen;
	}
	public void setIsopen(Integer isopen){
		this.isopen=isopen;
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

}