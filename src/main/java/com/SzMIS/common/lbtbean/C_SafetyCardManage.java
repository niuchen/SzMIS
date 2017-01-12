package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:39
null	*/

	public class C_SafetyCardManage{
	private String cardno;//
	private String cardcode;//
	private Integer cardtype;//
	private Integer status;//
	private Integer addby;//
	private String addtime;//
	private String updatetime;//
	private String photo;//
	private String batchno;//

	public String getCardno(){
		return this.cardno;
	}
	public void setCardno(String cardno){
		this.cardno=cardno;
	}
	public String getCardcode(){
		return this.cardcode;
	}
	public void setCardcode(String cardcode){
		this.cardcode=cardcode;
	}
	public Integer getCardtype(){
		return this.cardtype;
	}
	public void setCardtype(Integer cardtype){
		this.cardtype=cardtype;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getAddby(){
		return this.addby;
	}
	public void setAddby(Integer addby){
		this.addby=addby;
	}
	public String getAddtime(){
		return this.addtime;
	}
	public void setAddtime(String addtime){
		this.addtime=addtime;
	}
	public String getUpdatetime(){
		return this.updatetime;
	}
	public void setUpdatetime(String updatetime){
		this.updatetime=updatetime;
	}
	public String getPhoto(){
		return this.photo;
	}
	public void setPhoto(String photo){
		this.photo=photo;
	}
	public String getBatchno(){
		return this.batchno;
	}
	public void setBatchno(String batchno){
		this.batchno=batchno;
	}

}