package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class R_STEP{
	private Integer id_step;//
	private Integer id_transformation;//
	private String name;//
	private String description;//
	private Integer id_step_type;//
	private String distribute;//
	private Integer copies;//
	private Integer gui_location_x;//
	private Integer gui_location_y;//
	private String gui_draw;//

	public Integer getId_step(){
		return this.id_step;
	}
	public void setId_step(Integer id_step){
		this.id_step=id_step;
	}
	public Integer getId_transformation(){
		return this.id_transformation;
	}
	public void setId_transformation(Integer id_transformation){
		this.id_transformation=id_transformation;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public Integer getId_step_type(){
		return this.id_step_type;
	}
	public void setId_step_type(Integer id_step_type){
		this.id_step_type=id_step_type;
	}
	public String getDistribute(){
		return this.distribute;
	}
	public void setDistribute(String distribute){
		this.distribute=distribute;
	}
	public Integer getCopies(){
		return this.copies;
	}
	public void setCopies(Integer copies){
		this.copies=copies;
	}
	public Integer getGui_location_x(){
		return this.gui_location_x;
	}
	public void setGui_location_x(Integer gui_location_x){
		this.gui_location_x=gui_location_x;
	}
	public Integer getGui_location_y(){
		return this.gui_location_y;
	}
	public void setGui_location_y(Integer gui_location_y){
		this.gui_location_y=gui_location_y;
	}
	public String getGui_draw(){
		return this.gui_draw;
	}
	public void setGui_draw(String gui_draw){
		this.gui_draw=gui_draw;
	}

}