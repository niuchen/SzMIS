package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class C_StorySpecial{
	private Integer storyspecialid;//
	private String specialname;//
	private String specialdesc;//
	private Integer storytypeid;//
	private String thumbpath;//
	private Integer agerange;//
	private String title;//
	private Integer sfrom;//
	private Integer istop;//

	public Integer getStoryspecialid(){
		return this.storyspecialid;
	}
	public void setStoryspecialid(Integer storyspecialid){
		this.storyspecialid=storyspecialid;
	}
	public String getSpecialname(){
		return this.specialname;
	}
	public void setSpecialname(String specialname){
		this.specialname=specialname;
	}
	public String getSpecialdesc(){
		return this.specialdesc;
	}
	public void setSpecialdesc(String specialdesc){
		this.specialdesc=specialdesc;
	}
	public Integer getStorytypeid(){
		return this.storytypeid;
	}
	public void setStorytypeid(Integer storytypeid){
		this.storytypeid=storytypeid;
	}
	public String getThumbpath(){
		return this.thumbpath;
	}
	public void setThumbpath(String thumbpath){
		this.thumbpath=thumbpath;
	}
	public Integer getAgerange(){
		return this.agerange;
	}
	public void setAgerange(Integer agerange){
		this.agerange=agerange;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public Integer getSfrom(){
		return this.sfrom;
	}
	public void setSfrom(Integer sfrom){
		this.sfrom=sfrom;
	}
	public Integer getIstop(){
		return this.istop;
	}
	public void setIstop(Integer istop){
		this.istop=istop;
	}

}