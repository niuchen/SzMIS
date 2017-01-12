package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class FlowerRule{
	private Integer ruleid;//
	private String projecttype;//
	private Integer tasktype;//
	private String typeinfo;//
	private Integer frequence;//
	private Integer reward;//
	private Integer maxreward;//
	private Integer usertype;//
	private Integer status;//
	private String limit;//
	private String remark;//

	public Integer getRuleid(){
		return this.ruleid;
	}
	public void setRuleid(Integer ruleid){
		this.ruleid=ruleid;
	}
	public String getProjecttype(){
		return this.projecttype;
	}
	public void setProjecttype(String projecttype){
		this.projecttype=projecttype;
	}
	public Integer getTasktype(){
		return this.tasktype;
	}
	public void setTasktype(Integer tasktype){
		this.tasktype=tasktype;
	}
	public String getTypeinfo(){
		return this.typeinfo;
	}
	public void setTypeinfo(String typeinfo){
		this.typeinfo=typeinfo;
	}
	public Integer getFrequence(){
		return this.frequence;
	}
	public void setFrequence(Integer frequence){
		this.frequence=frequence;
	}
	public Integer getReward(){
		return this.reward;
	}
	public void setReward(Integer reward){
		this.reward=reward;
	}
	public Integer getMaxreward(){
		return this.maxreward;
	}
	public void setMaxreward(Integer maxreward){
		this.maxreward=maxreward;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public String getLimit(){
		return this.limit;
	}
	public void setLimit(String limit){
		this.limit=limit;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

}