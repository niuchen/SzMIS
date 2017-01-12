package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class SosSmsReceive{
	private String receiveid;//
	private Integer messageid;//
	private String receivername;//
	private String receiverphone;//

	public String getReceiveid(){
		return this.receiveid;
	}
	public void setReceiveid(String receiveid){
		this.receiveid=receiveid;
	}
	public Integer getMessageid(){
		return this.messageid;
	}
	public void setMessageid(Integer messageid){
		this.messageid=messageid;
	}
	public String getReceivername(){
		return this.receivername;
	}
	public void setReceivername(String receivername){
		this.receivername=receivername;
	}
	public String getReceiverphone(){
		return this.receiverphone;
	}
	public void setReceiverphone(String receiverphone){
		this.receiverphone=receiverphone;
	}

}