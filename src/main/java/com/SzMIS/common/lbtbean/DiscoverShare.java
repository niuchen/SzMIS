package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class DiscoverShare{
	private Integer shareid;//
	private Integer discoverid;//
	private Integer type;//
	private Integer usersid;//
	private Integer usertype;//
	private String sharetime;//
	private Integer sharewhere;//
	private String url;//
	private String title;//

	public Integer getShareid(){
		return this.shareid;
	}
	public void setShareid(Integer shareid){
		this.shareid=shareid;
	}
	public Integer getDiscoverid(){
		return this.discoverid;
	}
	public void setDiscoverid(Integer discoverid){
		this.discoverid=discoverid;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getUsersid(){
		return this.usersid;
	}
	public void setUsersid(Integer usersid){
		this.usersid=usersid;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}
	public String getSharetime(){
		return this.sharetime;
	}
	public void setSharetime(String sharetime){
		this.sharetime=sharetime;
	}
	public Integer getSharewhere(){
		return this.sharewhere;
	}
	public void setSharewhere(Integer sharewhere){
		this.sharewhere=sharewhere;
	}
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url=url;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}

}