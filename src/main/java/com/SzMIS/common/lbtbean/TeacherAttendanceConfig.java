package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class TeacherAttendanceConfig{
	private Integer id;//
	private Integer schoolid;//
	private Integer deptid;//
	private String dates;//
	private String firstbegintime;//
	private String firstendtime;//
	private String secondbegintime;//
	private String secondendtime;//
	private Integer belateminutes;//
	private Integer leaveminutes;//
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
	public Integer getDeptid(){
		return this.deptid;
	}
	public void setDeptid(Integer deptid){
		this.deptid=deptid;
	}
	public String getDates(){
		return this.dates;
	}
	public void setDates(String dates){
		this.dates=dates;
	}
	public String getFirstbegintime(){
		return this.firstbegintime;
	}
	public void setFirstbegintime(String firstbegintime){
		this.firstbegintime=firstbegintime;
	}
	public String getFirstendtime(){
		return this.firstendtime;
	}
	public void setFirstendtime(String firstendtime){
		this.firstendtime=firstendtime;
	}
	public String getSecondbegintime(){
		return this.secondbegintime;
	}
	public void setSecondbegintime(String secondbegintime){
		this.secondbegintime=secondbegintime;
	}
	public String getSecondendtime(){
		return this.secondendtime;
	}
	public void setSecondendtime(String secondendtime){
		this.secondendtime=secondendtime;
	}
	public Integer getBelateminutes(){
		return this.belateminutes;
	}
	public void setBelateminutes(Integer belateminutes){
		this.belateminutes=belateminutes;
	}
	public Integer getLeaveminutes(){
		return this.leaveminutes;
	}
	public void setLeaveminutes(Integer leaveminutes){
		this.leaveminutes=leaveminutes;
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