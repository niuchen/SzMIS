package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class ChatBuffer{
	private Integer chatbufferid;//
	private Integer userid;//
	private Integer friendid;//
	private String friendname;//
	private Integer msgtype;//
	private Integer usertype;//
	private Integer friendtype;//
	private String friendicon;//
	private String voiceurl;//
	private String alias;//
	private String content;//
	private String title;//
	private String flag;//
	private String createat;//

	public Integer getChatbufferid(){
		return this.chatbufferid;
	}
	public void setChatbufferid(Integer chatbufferid){
		this.chatbufferid=chatbufferid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public Integer getFriendid(){
		return this.friendid;
	}
	public void setFriendid(Integer friendid){
		this.friendid=friendid;
	}
	public String getFriendname(){
		return this.friendname;
	}
	public void setFriendname(String friendname){
		this.friendname=friendname;
	}
	public Integer getMsgtype(){
		return this.msgtype;
	}
	public void setMsgtype(Integer msgtype){
		this.msgtype=msgtype;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}
	public Integer getFriendtype(){
		return this.friendtype;
	}
	public void setFriendtype(Integer friendtype){
		this.friendtype=friendtype;
	}
	public String getFriendicon(){
		return this.friendicon;
	}
	public void setFriendicon(String friendicon){
		this.friendicon=friendicon;
	}
	public String getVoiceurl(){
		return this.voiceurl;
	}
	public void setVoiceurl(String voiceurl){
		this.voiceurl=voiceurl;
	}
	public String getAlias(){
		return this.alias;
	}
	public void setAlias(String alias){
		this.alias=alias;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getFlag(){
		return this.flag;
	}
	public void setFlag(String flag){
		this.flag=flag;
	}
	public String getCreateat(){
		return this.createat;
	}
	public void setCreateat(String createat){
		this.createat=createat;
	}

}