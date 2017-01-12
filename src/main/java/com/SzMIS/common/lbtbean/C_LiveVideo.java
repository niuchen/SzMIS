package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_LiveVideo{
	private Integer liveid;//
	private String roomid;//
	private String livename;//
	private Integer livetype;//
	private Integer liveobjtype;//
	private String begintime;//
	private Integer status;//
	private Integer teacherid;//
	private String createtime;//
	private String thumbnail;//

	public Integer getLiveid(){
		return this.liveid;
	}
	public void setLiveid(Integer liveid){
		this.liveid=liveid;
	}
	public String getRoomid(){
		return this.roomid;
	}
	public void setRoomid(String roomid){
		this.roomid=roomid;
	}
	public String getLivename(){
		return this.livename;
	}
	public void setLivename(String livename){
		this.livename=livename;
	}
	public Integer getLivetype(){
		return this.livetype;
	}
	public void setLivetype(Integer livetype){
		this.livetype=livetype;
	}
	public Integer getLiveobjtype(){
		return this.liveobjtype;
	}
	public void setLiveobjtype(Integer liveobjtype){
		this.liveobjtype=liveobjtype;
	}
	public String getBegintime(){
		return this.begintime;
	}
	public void setBegintime(String begintime){
		this.begintime=begintime;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getTeacherid(){
		return this.teacherid;
	}
	public void setTeacherid(Integer teacherid){
		this.teacherid=teacherid;
	}
	public String getCreatetime(){
		return this.createtime;
	}
	public void setCreatetime(String createtime){
		this.createtime=createtime;
	}
	public String getThumbnail(){
		return this.thumbnail;
	}
	public void setThumbnail(String thumbnail){
		this.thumbnail=thumbnail;
	}

}