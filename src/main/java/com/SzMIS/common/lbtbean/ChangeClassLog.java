package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class ChangeClassLog{
	private Integer changeid;//
	private Integer studentid;//
	private Integer oldclassid;//
	private Integer newclassid;//
	private Integer schoolid;//
	private String studentname;//
	private String oldclassname;//
	private String newclassname;//
	private String schoolname;//
	private Integer addby;//
	private String operator;//
	private String addtime;//

	public Integer getChangeid(){
		return this.changeid;
	}
	public void setChangeid(Integer changeid){
		this.changeid=changeid;
	}
	public Integer getStudentid(){
		return this.studentid;
	}
	public void setStudentid(Integer studentid){
		this.studentid=studentid;
	}
	public Integer getOldclassid(){
		return this.oldclassid;
	}
	public void setOldclassid(Integer oldclassid){
		this.oldclassid=oldclassid;
	}
	public Integer getNewclassid(){
		return this.newclassid;
	}
	public void setNewclassid(Integer newclassid){
		this.newclassid=newclassid;
	}
	public Integer getSchoolid(){
		return this.schoolid;
	}
	public void setSchoolid(Integer schoolid){
		this.schoolid=schoolid;
	}
	public String getStudentname(){
		return this.studentname;
	}
	public void setStudentname(String studentname){
		this.studentname=studentname;
	}
	public String getOldclassname(){
		return this.oldclassname;
	}
	public void setOldclassname(String oldclassname){
		this.oldclassname=oldclassname;
	}
	public String getNewclassname(){
		return this.newclassname;
	}
	public void setNewclassname(String newclassname){
		this.newclassname=newclassname;
	}
	public String getSchoolname(){
		return this.schoolname;
	}
	public void setSchoolname(String schoolname){
		this.schoolname=schoolname;
	}
	public Integer getAddby(){
		return this.addby;
	}
	public void setAddby(Integer addby){
		this.addby=addby;
	}
	public String getOperator(){
		return this.operator;
	}
	public void setOperator(String operator){
		this.operator=operator;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}

}