package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class R_JOBENTRY_COPY{
	private Integer id_jobentry_copy;//
	private Integer id_jobentry;//
	private Integer id_job;//
	private Integer id_jobentry_type;//
	private Integer nr;//
	private Integer gui_location_x;//
	private Integer gui_location_y;//
	private String gui_draw;//
	private String parallel;//

	public Integer getId_jobentry_copy(){
		return this.id_jobentry_copy;
	}
	public void setId_jobentry_copy(Integer id_jobentry_copy){
		this.id_jobentry_copy=id_jobentry_copy;
	}
	public Integer getId_jobentry(){
		return this.id_jobentry;
	}
	public void setId_jobentry(Integer id_jobentry){
		this.id_jobentry=id_jobentry;
	}
	public Integer getId_job(){
		return this.id_job;
	}
	public void setId_job(Integer id_job){
		this.id_job=id_job;
	}
	public Integer getId_jobentry_type(){
		return this.id_jobentry_type;
	}
	public void setId_jobentry_type(Integer id_jobentry_type){
		this.id_jobentry_type=id_jobentry_type;
	}
	public Integer getNr(){
		return this.nr;
	}
	public void setNr(Integer nr){
		this.nr=nr;
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
	public String getParallel(){
		return this.parallel;
	}
	public void setParallel(String parallel){
		this.parallel=parallel;
	}

}