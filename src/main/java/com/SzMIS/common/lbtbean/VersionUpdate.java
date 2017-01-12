package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class VersionUpdate{
	private Integer updateid;//
	private Integer oldver;//
	private String oldvername;//
	private Integer newver;//
	private String newvername;//
	private Integer appflag;//
	private String updateurl;//
	private String updateinfo;//
	private String updatesize;//
	private Integer downnum;//
	private Integer isforce;//
	private Integer addby;//
	private String addtime;//
	private Integer isrelease;//

	public Integer getUpdateid(){
		return this.updateid;
	}
	public void setUpdateid(Integer updateid){
		this.updateid=updateid;
	}
	public Integer getOldver(){
		return this.oldver;
	}
	public void setOldver(Integer oldver){
		this.oldver=oldver;
	}
	public String getOldvername(){
		return this.oldvername;
	}
	public void setOldvername(String oldvername){
		this.oldvername=oldvername;
	}
	public Integer getNewver(){
		return this.newver;
	}
	public void setNewver(Integer newver){
		this.newver=newver;
	}
	public String getNewvername(){
		return this.newvername;
	}
	public void setNewvername(String newvername){
		this.newvername=newvername;
	}
	public Integer getAppflag(){
		return this.appflag;
	}
	public void setAppflag(Integer appflag){
		this.appflag=appflag;
	}
	public String getUpdateurl(){
		return this.updateurl;
	}
	public void setUpdateurl(String updateurl){
		this.updateurl=updateurl;
	}
	public String getUpdateinfo(){
		return this.updateinfo;
	}
	public void setUpdateinfo(String updateinfo){
		this.updateinfo=updateinfo;
	}
	public String getUpdatesize(){
		return this.updatesize;
	}
	public void setUpdatesize(String updatesize){
		this.updatesize=updatesize;
	}
	public Integer getDownnum(){
		return this.downnum;
	}
	public void setDownnum(Integer downnum){
		this.downnum=downnum;
	}
	public Integer getIsforce(){
		return this.isforce;
	}
	public void setIsforce(Integer isforce){
		this.isforce=isforce;
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
	public Integer getIsrelease(){
		return this.isrelease;
	}
	public void setIsrelease(Integer isrelease){
		this.isrelease=isrelease;
	}

}