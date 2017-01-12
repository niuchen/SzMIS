package com.SzMIS.sms.custom.pojo;

import com.SzMIS.common.smssend.SendInfoMessage;

/***老师园长的发送信息***/
public class Lsyzsms {
	private Integer usersid; //用户ID
	private String name; //用户名称
	private String phone; //用户手机号
	private Integer state; //用户状态
	private Integer usertype; //用户类型
	private Integer schoolid; //幼儿园ID
	private String schoolname; //幼儿园名称
	private Integer areaid ; //地区ID
	private String areaname ;//地区名称
	private String insertdate;//插入时间
	private String spcode;//幼儿园特服号码
	private String smsid;
	private String smstext;
	private String lid;
	
	public String getSpcode() {
		return spcode;
	}
	public void setSpcode(String spcode) {
		this.spcode = spcode;
	}
	@Override
	public String toString() {
		return "Lsyzsms [usersid=" + usersid + ", name=" + name + ", phone="
				+ phone + ", state=" + state + ", usertype=" + usertype
				+ ", schoolid=" + schoolid + ", schoolname=" + schoolname
				+ ", areaid=" + areaid + ", areaname=" + areaname
				+ ", insertdate=" + insertdate + ", smsid=" + smsid
				+ ", smstext=" + smstext + ", lid=" + lid + ", getLid()="
				+ getLid() + ", getSmstext()=" + getSmstext() + ", getSmsid()="
				+ getSmsid() + ", getInsertdate()=" + getInsertdate()
				+ ", getUsersid()=" + getUsersid() + ", getName()=" + getName()
				+ ", getPhone()=" + getPhone() + ", getState()=" + getState()
				+ ", getUsertype()=" + getUsertype() + ", getSchoolid()="
				+ getSchoolid() + ", getSchoolname()=" + getSchoolname()
				+ ", getAreaid()=" + getAreaid() + ", getAreaname()="
				+ getAreaname() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getSmstext() {
		return smstext;
	}
	public void setSmstext(String smstext) {
		this.smstext = smstext;
	}
	public String getSmsid() {
		return smsid;
	}
	public void setSmsid(String smsid) {
		this.smsid = smsid;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public Integer getUsersid() {
		return usersid;
	}
	public void setUsersid(Integer usersid) {
		this.usersid = usersid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getUsertype() {
		return usertype;
	}
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}
	public Integer getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(Integer schoolid) {
		this.schoolid = schoolid;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public Integer getAreaid() {
		return areaid;
	}
	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	 
}
