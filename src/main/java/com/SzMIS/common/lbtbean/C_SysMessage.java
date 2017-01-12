package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class C_SysMessage{
	private Integer id;//
	private String messagedesc;//
	private Integer flag;//
	private String content;//
	private Integer status;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getMessagedesc(){
		return this.messagedesc;
	}
	public void setMessagedesc(String messagedesc){
		this.messagedesc=messagedesc;
	}
	public Integer getFlag(){
		return this.flag;
	}
	public void setFlag(Integer flag){
		this.flag=flag;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}

}