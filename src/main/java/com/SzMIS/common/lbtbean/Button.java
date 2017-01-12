package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Button{
	private Integer buttonid;//
	private String code;//
	private String buttonname;//
	private Integer sort;//
	private String icon;//
	private String flag;//
	private String remark;//

	public Integer getButtonid(){
		return this.buttonid;
	}
	public void setButtonid(Integer buttonid){
		this.buttonid=buttonid;
	}
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getButtonname(){
		return this.buttonname;
	}
	public void setButtonname(String buttonname){
		this.buttonname=buttonname;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort=sort;
	}
	public String getIcon(){
		return this.icon;
	}
	public void setIcon(String icon){
		this.icon=icon;
	}
	public String getFlag(){
		return this.flag;
	}
	public void setFlag(String flag){
		this.flag=flag;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

}