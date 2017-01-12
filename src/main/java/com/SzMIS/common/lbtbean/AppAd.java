package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class AppAd{
	private Integer id;//
	private String imgpath;//
	private String url;//
	private String tooltip;//
	private Integer status;//
	private String addby;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getImgpath(){
		return this.imgpath;
	}
	public void setImgpath(String imgpath){
		this.imgpath=imgpath;
	}
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url=url;
	}
	public String getTooltip(){
		return this.tooltip;
	}
	public void setTooltip(String tooltip){
		this.tooltip=tooltip;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public String getAddby(){
		return this.addby;
	}
	public void setAddby(String addby){
		this.addby=addby;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}