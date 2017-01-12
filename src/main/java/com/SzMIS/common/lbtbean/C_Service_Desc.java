package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class C_Service_Desc{
	private Integer id;//
	private Integer servicetype;//
	private String modulename;//
	private String moduledesc;//
	private String iconurl;//
	private String moduleurl;//
	private String moduledescimgurl;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getServicetype(){
		return this.servicetype;
	}
	public void setServicetype(Integer servicetype){
		this.servicetype=servicetype;
	}
	public String getModulename(){
		return this.modulename;
	}
	public void setModulename(String modulename){
		this.modulename=modulename;
	}
	public String getModuledesc(){
		return this.moduledesc;
	}
	public void setModuledesc(String moduledesc){
		this.moduledesc=moduledesc;
	}
	public String getIconurl(){
		return this.iconurl;
	}
	public void setIconurl(String iconurl){
		this.iconurl=iconurl;
	}
	public String getModuleurl(){
		return this.moduleurl;
	}
	public void setModuleurl(String moduleurl){
		this.moduleurl=moduleurl;
	}
	public String getModuledescimgurl(){
		return this.moduledescimgurl;
	}
	public void setModuledescimgurl(String moduledescimgurl){
		this.moduledescimgurl=moduledescimgurl;
	}

}