package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class C_PVComment{
	private Integer pvid;//
	private Integer usersid;//
	private Integer usertype;//
	private Integer commentid;//
	private String content;//
	private String addtime;//
	private Integer upcomment;//
	private Integer id;//
	private Integer type;//

	public Integer getPvid(){
		return this.pvid;
	}
	public void setPvid(Integer pvid){
		this.pvid=pvid;
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
	public Integer getCommentid(){
		return this.commentid;
	}
	public void setCommentid(Integer commentid){
		this.commentid=commentid;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}
	public Integer getUpcomment(){
		return this.upcomment;
	}
	public void setUpcomment(Integer upcomment){
		this.upcomment=upcomment;
	}
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}

}