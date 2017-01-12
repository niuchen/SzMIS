package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:36
null	*/

	public class C_PVShare{
	private Integer shareid;//
	private Integer pvid;//
	private Integer type;//
	private Integer shareby;//
	private String sharetime;//
	private Integer sharewhere;//

	public Integer getShareid(){
		return this.shareid;
	}
	public void setShareid(Integer shareid){
		this.shareid=shareid;
	}
	public Integer getPvid(){
		return this.pvid;
	}
	public void setPvid(Integer pvid){
		this.pvid=pvid;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getShareby(){
		return this.shareby;
	}
	public void setShareby(Integer shareby){
		this.shareby=shareby;
	}
	public String getSharetime(){
		return this.sharetime;
	}
	public void setSharetime(String sharetime){
		this.sharetime=sharetime;
	}
	public Integer getSharewhere(){
		return this.sharewhere;
	}
	public void setSharewhere(Integer sharewhere){
		this.sharewhere=sharewhere;
	}

}