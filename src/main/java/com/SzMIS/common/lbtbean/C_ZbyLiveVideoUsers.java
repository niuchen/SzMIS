package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class C_ZbyLiveVideoUsers{
	private Integer liveid;//
	private Integer userid;//
	private String accesstime;//
	private String exittime;//

	public Integer getLiveid(){
		return this.liveid;
	}
	public void setLiveid(Integer liveid){
		this.liveid=liveid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid=userid;
	}
	public String getAccesstime(){
		return this.accesstime;
	}
	public void setAccesstime(String accesstime){
		this.accesstime=accesstime;
	}
	public String getExittime(){
		return this.exittime;
	}
	public void setExittime(String exittime){
		this.exittime=exittime;
	}

}