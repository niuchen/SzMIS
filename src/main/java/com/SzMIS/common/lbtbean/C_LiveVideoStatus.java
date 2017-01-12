package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_LiveVideoStatus{
	private Integer liveid;//
	private String liveno;//
	private Integer liveduration;//
	private Integer videoduration;//
	private Integer isvideo;//
	private String videodeadline;//
	private String begintime;//
	private String endtime;//
	private String jsliveid;//

	public Integer getLiveid(){
		return this.liveid;
	}
	public void setLiveid(Integer liveid){
		this.liveid=liveid;
	}
	public String getLiveno(){
		return this.liveno;
	}
	public void setLiveno(String liveno){
		this.liveno=liveno;
	}
	public Integer getLiveduration(){
		return this.liveduration;
	}
	public void setLiveduration(Integer liveduration){
		this.liveduration=liveduration;
	}
	public Integer getVideoduration(){
		return this.videoduration;
	}
	public void setVideoduration(Integer videoduration){
		this.videoduration=videoduration;
	}
	public Integer getIsvideo(){
		return this.isvideo;
	}
	public void setIsvideo(Integer isvideo){
		this.isvideo=isvideo;
	}
	public String getVideodeadline(){
		return this.videodeadline;
	}
	public void setVideodeadline(String videodeadline){
		this.videodeadline=videodeadline;
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
	public String getJsliveid(){
		return this.jsliveid;
	}
	public void setJsliveid(String jsliveid){
		this.jsliveid=jsliveid;
	}

}