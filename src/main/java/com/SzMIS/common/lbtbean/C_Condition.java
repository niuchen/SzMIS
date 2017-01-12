package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_Condition{
	private Integer id;//
	private Integer userid;//
	private String name;//
	private String value;//
	private String curvalue;//
	private Integer state;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value=value;
	}
	public String getCurvalue(){
		return this.curvalue;
	}
	public void setCurvalue(String curvalue){
		this.curvalue=curvalue;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}

}