package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class OrdData_try{
	private Integer id;//
	private Integer schoolid;//
	private Integer studentid;//
	private Integer servicetype;//
	private String begintime;//
	private String endtime;//
	private String addby;//
	private String addtime;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public Integer getStudentid(){
		return this.studentid;
	}
	public void setStudentid(Integer studentid){
		this.studentid=studentid;
	}
	public Integer getServicetype(){
		return this.servicetype;
	}
	public void setServicetype(Integer servicetype){
		this.servicetype=servicetype;
	}
	public String getBegintime(){
		return this.begintime;
	}
	public void setBegintime(String begintime){
		this.begintime=begintime;
	}
	public String getEndtime(){
		return this.endtime;
	}
	public void setEndtime(String endtime){
		this.endtime=endtime;
	}
	public String getAddby(){
		return this.addby;
	}
	public void setAddby(String addby){
		this.addby=addby;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}