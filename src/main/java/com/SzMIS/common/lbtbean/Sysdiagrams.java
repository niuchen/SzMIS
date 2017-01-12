package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class Sysdiagrams{
	private String name;//
	private Integer principal_id;//
	private Integer diagram_id;//
	private Integer version;//
	private Byte[] definition;//

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Integer getPrincipal_id(){
		return this.principal_id;
	}
	public void setPrincipal_id(Integer principal_id){
		this.principal_id=principal_id;
	}
	public Integer getDiagram_id(){
		return this.diagram_id;
	}
	public void setDiagram_id(Integer diagram_id){
		this.diagram_id=diagram_id;
	}
	public Integer getVersion(){
		return this.version;
	}
	public void setVersion(Integer version){
		this.version=version;
	}
	public Byte[] getDefinition(){
		return this.definition;
	}
	public void setDefinition(Byte[] definition){
		this.definition=definition;
	}

}