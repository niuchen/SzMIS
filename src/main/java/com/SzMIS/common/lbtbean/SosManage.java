package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class SosManage{
	private Integer messageid;//
	private Integer schoolid;//
	private String phone;//
	private String phonename;//
	private String smscontent;//
	private Integer status;//
	private Integer flag;//
	private Integer addby;//
	private String addtime;//

	public Integer getMessageid(){
		return this.messageid;
	}
	public void setMessageid(Integer messageid){
		this.messageid=messageid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhonename(){
		return this.phonename;
	}
	public void setPhonename(String phonename){
		this.phonename=phonename;
	}
	public String getSmscontent(){
		return this.smscontent;
	}
	public void setSmscontent(String smscontent){
		this.smscontent=smscontent;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getFlag(){
		return this.flag;
	}
	public void setFlag(Integer flag){
		this.flag=flag;
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

}