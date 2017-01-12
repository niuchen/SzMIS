package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:37
null	*/

	public class B_PhotoBookOper{
	private Integer id;//
	private Integer photobookid;//
	private Integer page;//
	private Integer element;//
	private Integer operate;//
	private Integer index;//
	private String oldvalue;//
	private String newvalue;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getPhotobookid(){
		return this.photobookid;
	}
	public void setPhotobookid(Integer photobookid){
		this.photobookid=photobookid;
	}
	public Integer getPage(){
		return this.page;
	}
	public void setPage(Integer page){
		this.page=page;
	}
	public Integer getElement(){
		return this.element;
	}
	public void setElement(Integer element){
		this.element=element;
	}
	public Integer getOperate(){
		return this.operate;
	}
	public void setOperate(Integer operate){
		this.operate=operate;
	}
	public Integer getIndex(){
		return this.index;
	}
	public void setIndex(Integer index){
		this.index=index;
	}
	public String getOldvalue(){
		return this.oldvalue;
	}
	public void setOldvalue(String oldvalue){
		this.oldvalue=oldvalue;
	}
	public String getNewvalue(){
		return this.newvalue;
	}
	public void setNewvalue(String newvalue){
		this.newvalue=newvalue;
	}

}