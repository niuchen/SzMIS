package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class C_Story{
	private Integer storyid;//
	private String name;//
	private Integer storyspecialid;//
	private String path;//
	private Integer addby;//
	private String addtime;//
	private Integer listens;//

	public Integer getStoryid(){
		return this.storyid;
	}
	public void setStoryid(Integer storyid){
		this.storyid=storyid;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Integer getStoryspecialid(){
		return this.storyspecialid;
	}
	public void setStoryspecialid(Integer storyspecialid){
		this.storyspecialid=storyspecialid;
	}
	public String getPath(){
		return this.path;
	}
	public void setPath(String path){
		this.path=path;
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
	public Integer getListens(){
		return this.listens;
	}
	public void setListens(Integer listens){
		this.listens=listens;
	}

}