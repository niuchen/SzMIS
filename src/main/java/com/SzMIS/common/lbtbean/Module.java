package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Module{
	private Integer moduleid;//
	private String name;//
	private Integer level;//
	private Integer upmodule;//
	private String url;//
	private String descr;//
	private String icon;//
	private Integer sort;//
	private String version;//
	private Integer state;//
	private Integer platform;//

	public Integer getModuleid(){
		return this.moduleid;
	}
	public void setModuleid(Integer moduleid){
		this.moduleid=moduleid;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Integer getLevel(){
		return this.level;
	}
	public void setLevel(Integer level){
		this.level=level;
	}
	public Integer getUpmodule(){
		return this.upmodule;
	}
	public void setUpmodule(Integer upmodule){
		this.upmodule=upmodule;
	}
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url=url;
	}
	public String getDescr(){
		return this.descr;
	}
	public void setDescr(String descr){
		this.descr=descr;
	}
	public String getIcon(){
		return this.icon;
	}
	public void setIcon(String icon){
		this.icon=icon;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort=sort;
	}
	public String getVersion(){
		return this.version;
	}
	public void setVersion(String version){
		this.version=version;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getPlatform(){
		return this.platform;
	}
	public void setPlatform(Integer platform){
		this.platform=platform;
	}

}