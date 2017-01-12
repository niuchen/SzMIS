package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class DictionaryDetail{
	private Integer id;//
	private String name;//
	private String val;//
	private Integer flag;//
	private Integer dictionary;//
	private String icon;//

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
	public String getVal(){
		return this.val;
	}
	public void setVal(String val){
		this.val=val;
	}
	public Integer getFlag(){
		return this.flag;
	}
	public void setFlag(Integer flag){
		this.flag=flag;
	}
	public Integer getDictionary(){
		return this.dictionary;
	}
	public void setDictionary(Integer dictionary){
		this.dictionary=dictionary;
	}
	public String getIcon(){
		return this.icon;
	}
	public void setIcon(String icon){
		this.icon=icon;
	}

}