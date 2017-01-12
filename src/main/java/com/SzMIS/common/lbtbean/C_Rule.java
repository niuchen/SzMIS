package com.SzMIS.common.lbtbean;

	/**
	*	*@author niuchen2016-10-11 11:00:38
null	*/

	public class C_Rule{
	private Integer id;//
	private Integer ruletype;//
	private Integer usertype;//
	private String rulekey;//
	private Integer rulevalue;//
	private String ruledesc;//

	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getRuletype(){
		return this.ruletype;
	}
	public void setRuletype(Integer ruletype){
		this.ruletype=ruletype;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
	public void setUsertype(Integer usertype){
		this.usertype=usertype;
	}
	public String getRulekey(){
		return this.rulekey;
	}
	public void setRulekey(String rulekey){
		this.rulekey=rulekey;
	}
	public Integer getRulevalue(){
		return this.rulevalue;
	}
	public void setRulevalue(Integer rulevalue){
		this.rulevalue=rulevalue;
	}
	public String getRuledesc(){
		return this.ruledesc;
	}
	public void setRuledesc(String ruledesc){
		this.ruledesc=ruledesc;
	}

}