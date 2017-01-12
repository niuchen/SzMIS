package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class B_NewPhotos{
	private Integer photosid;//
	private String name;//
	private Integer addby;//
	private String addtime;//
	private Integer status;//

	public Integer getPhotosid(){
		return this.photosid;
	}
	public void setPhotosid(Integer photosid){
		this.photosid=photosid;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
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
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}