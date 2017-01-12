package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class C_ConfigAlert{
	private Integer id;//
	private String name;//
	private String condition;//
	private String type;//
	private String content;//
	private Integer state;//
	private String where;//
	private Integer role;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getCondition(){
		return this.condition;
	}
	public void setCondition(String condition){
		this.condition=condition;
	}
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public String getWhere(){
		return this.where;
	}
	public void setWhere(String where){
		this.where=where;
	}
	public Integer getRole(){
		return this.role;
	}
	public void setRole(Integer role){
		this.role=role;
	}

}