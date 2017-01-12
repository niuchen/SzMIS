package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_SafetyCardBinding{
	private Integer id;//
	private String cardno;//
	private Integer userid;//
	private Integer role;//
	private String bindtime;//
	private Integer addby;//
	private Integer status;//
	private String unbindtime;//
	private Integer schoolid;//
	private String deposit;//
	private String cardcode;//
	private Integer usertype;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getCardno(){
		return this.cardno;
	}
	public void setCardno(String cardno){
		this.cardno=cardno;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public Integer getRole(){
		return this.role;
	}
	public void setRole(Integer role){
		this.role=role;
	}
	public String getBindtime(){
		return this.bindtime;
	}
	public void setBindtime(String bindtime){
		this.bindtime=bindtime;
	}
	public Integer getAddby(){
		return this.addby;
	}
	public void setAddby(Integer addby){
		this.addby=addby;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public String getUnbindtime(){
		return this.unbindtime;
	}
	public void setUnbindtime(String unbindtime){
		this.unbindtime=unbindtime;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getDeposit(){
		return this.deposit;
	}
	public void setDeposit(String deposit){
		this.deposit=deposit;
	}
	public String getCardcode(){
		return this.cardcode;
	}
	public void setCardcode(String cardcode){
		this.cardcode=cardcode;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}

}