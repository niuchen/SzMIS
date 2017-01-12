package com.SzMIS.sms.custom.pojo;
/**短信发送提交信息**/
public class Smssubmit {
	
		private String	city;//城市
		private String	county;//区县
		private String	yeyfangshi;//幼儿园发送选择1全部 2自选 3排除
		private String	youeryuan_xz_id;//选择幼儿园ID,号分割
			
		private String	lyrole;//是否发送老师与园长 
		private String  lyshenfen;//发送老师园长身份.  1.老师与园长. 2.园长. 3.老师(剔除园长)
		private String	lylogin;//老师园长 登陆条件 1不限   2多少天已登陆天数   3超过多少天登陆
		private Integer	lylogintext1;//老师园长已登陆天数
		private Integer	lylogintext2;//老师园长超过登陆天数
		private String	lyAPP;//老师园长是否安卓APP 1不限  2安装  3未安装
		private String	lyiszx;//用户状态 1 不限  2正常  3退订
			
		private String	jzrole;//是否发送家长
		private String	jzrtj;//发送联系人 1全部 2第一 3第二
		private String	jzywtj;//业务开通条件    1亲子视窗  2报平安  3平安成长4健康档案 5童忆成长 0未开通
		private String	jzlogin;//家长登陆条件 1不限   2多少天已登陆天数   3超过多少天登陆
		private Integer	jzlogintext1;//已登陆天数
		private Integer	jzlogintext2;//超过登陆天数
		private String	jzAPP;//是否安装app
		private String	jziszx;//用户状态1正常 2退订
		private Integer	jzrzsc;// 入驻时长:
			
		private String	smscontent;//短信内容
		private String	tfhaoma;//特服号码 1免费  2收费
		private String	fstype;//发送类型 1立即 2延时
		
		private String smsid;//序列ID
		private Integer lyissend;//是否发送完毕 1 完毕  2没有 老师
		private Integer jzissend;//是否发送完毕 1 完毕  2没有 家长
		private Integer lysendcount1;//预估发送总条数 老师
		private Integer jzsendcount1;//预估发送总条数 家长
		private Integer lysendcount2;//已发送总条数 老师
		private Integer jzsendcount2;//已发送总条数 家长
		private String  lyExcmsg;//老师发送时异常内容
		private String  jzExcmsg;//家长发送时异常内容
		
		private String insertdate;
		private String updatedate;
		
		public String getInsertdate() {
			return insertdate;
		}

		public void setInsertdate(String insertdate) {
			this.insertdate = insertdate;
		}

		public String getUpdatedate() {
			return updatedate;
		}

		public void setUpdatedate(String updatedate) {
			this.updatedate = updatedate;
		}

		public Integer getLysendcount1() {
			return lysendcount1;
		}

		public void setLysendcount1(Integer lysendcount1) {
			this.lysendcount1 = lysendcount1;
		}

		public Integer getJzsendcount1() {
			return jzsendcount1;
		}

		public void setJzsendcount1(Integer jzsendcount1) {
			this.jzsendcount1 = jzsendcount1;
		}

		public Integer getLysendcount2() {
			return lysendcount2;
		}

		public void setLysendcount2(Integer lysendcount2) {
			this.lysendcount2 = lysendcount2;
		}

		public Integer getJzsendcount2() {
			return jzsendcount2;
		}

		public void setJzsendcount2(Integer jzsendcount2) {
			this.jzsendcount2 = jzsendcount2;
		}

		public String getLyExcmsg() {
			return lyExcmsg;
		}

		public void setLyExcmsg(String lyExcmsg) {
			this.lyExcmsg = lyExcmsg;
		}

		public String getJzExcmsg() {
			return jzExcmsg;
		}

		public void setJzExcmsg(String jzExcmsg) {
			this.jzExcmsg = jzExcmsg;
		}

		public String getSmsid() {
			return smsid;
		}

		public void setSmsid(String smsid) {
			this.smsid = smsid;
		}

		public Integer getLyissend() {
			return lyissend;
		}

		public void setLyissend(Integer lyissend) {
			this.lyissend = lyissend;
		}

		public Integer getJzissend() {
			return jzissend;
		}

		public void setJzissend(Integer jzissend) {
			this.jzissend = jzissend;
		}

	 

	 

		@Override
		public String toString() {
			return "Smssubmit [city=" + city + ", county=" + county
					+ ", yeyfangshi=" + yeyfangshi + ", youeryuan_xz_id="
					+ youeryuan_xz_id + ", lyrole=" + lyrole + ", lyshenfen="
					+ lyshenfen + ", lylogin=" + lylogin + ", lylogintext1="
					+ lylogintext1 + ", lylogintext2=" + lylogintext2
					+ ", lyAPP=" + lyAPP + ", lyiszx=" + lyiszx + ", jzrole="
					+ jzrole + ", jzrtj=" + jzrtj + ", jzywtj=" + jzywtj
					+ ", jzlogin=" + jzlogin + ", jzlogintext1=" + jzlogintext1
					+ ", jzlogintext2=" + jzlogintext2 + ", jzAPP=" + jzAPP
					+ ", jziszx=" + jziszx + ", jzrzsc=" + jzrzsc
					+ ", smscontent=" + smscontent + ", tfhaoma=" + tfhaoma
					+ ", fstype=" + fstype + ", smsid=" + smsid + ", lyissend="
					+ lyissend + ", jzissend=" + jzissend + ", lysendcount1="
					+ lysendcount1 + ", jzsendcount1=" + jzsendcount1
					+ ", lysendcount2=" + lysendcount2 + ", jzsendcount2="
					+ jzsendcount2 + ", lyExcmsg=" + lyExcmsg + ", jzExcmsg="
					+ jzExcmsg + ", insertdate=" + insertdate + ", updatedate="
					+ updatedate + ", getInsertdate()=" + getInsertdate()
					+ ", getUpdatedate()=" + getUpdatedate()
					+ ", getLysendcount1()=" + getLysendcount1()
					+ ", getJzsendcount1()=" + getJzsendcount1()
					+ ", getLysendcount2()=" + getLysendcount2()
					+ ", getJzsendcount2()=" + getJzsendcount2()
					+ ", getLyExcmsg()=" + getLyExcmsg() + ", getJzExcmsg()="
					+ getJzExcmsg() + ", getSmsid()=" + getSmsid()
					+ ", getLyissend()=" + getLyissend() + ", getJzissend()="
					+ getJzissend() + ", getCity()=" + getCity()
					+ ", getLyshenfen()=" + getLyshenfen() + ", getCounty()="
					+ getCounty() + ", getYeyfangshi()=" + getYeyfangshi()
					+ ", getYoueryuan_xz_id()=" + getYoueryuan_xz_id()
					+ ", getLyrole()=" + getLyrole() + ", getLylogin()="
					+ getLylogin() + ", getLylogintext1()=" + getLylogintext1()
					+ ", getLylogintext2()=" + getLylogintext2()
					+ ", getLyAPP()=" + getLyAPP() + ", getLyiszx()="
					+ getLyiszx() + ", getJzrole()=" + getJzrole()
					+ ", getJzrtj()=" + getJzrtj() + ", getJzywtj()="
					+ getJzywtj() + ", getJzlogin()=" + getJzlogin()
					+ ", getJzlogintext1()=" + getJzlogintext1()
					+ ", getJzlogintext2()=" + getJzlogintext2()
					+ ", getJzAPP()=" + getJzAPP() + ", getJziszx()="
					+ getJziszx() + ", getJzrzsc()=" + getJzrzsc()
					+ ", getSmscontent()=" + getSmscontent()
					+ ", getTfhaoma()=" + getTfhaoma() + ", getFstype()="
					+ getFstype() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

		public String getCity() {
			return city;
		}
		
		public String getLyshenfen() {
			return lyshenfen;
		}

		public void setLyshenfen(String lyshenfen) {
			this.lyshenfen = lyshenfen;
		}

		public void setCity(String city) {
			this.city = city;
		}
		public String getCounty() {
			return county;
		}
		public void setCounty(String county) {
			this.county = county;
		}
		public String getYeyfangshi() {
			return yeyfangshi;
		}
		public void setYeyfangshi(String yeyfangshi) {
			this.yeyfangshi = yeyfangshi;
		}
		public String getYoueryuan_xz_id() {
			return youeryuan_xz_id;
		}
		public void setYoueryuan_xz_id(String youeryuan_xz_id) {
			this.youeryuan_xz_id = youeryuan_xz_id;
		}
		public String getLyrole() {
			return lyrole;
		}
		public void setLyrole(String lyrole) {
			this.lyrole = lyrole;
		}
		public String getLylogin() {
			return lylogin;
		}
		public void setLylogin(String lylogin) {
			this.lylogin = lylogin;
		}
		public Integer getLylogintext1() {
			return lylogintext1;
		}
		public void setLylogintext1(Integer lylogintext1) {
			this.lylogintext1 = lylogintext1;
		}
		public Integer getLylogintext2() {
			return lylogintext2;
		}
		public void setLylogintext2(Integer lylogintext2) {
			this.lylogintext2 = lylogintext2;
		}
		public String getLyAPP() {
			return lyAPP;
		}
		public void setLyAPP(String lyAPP) {
			this.lyAPP = lyAPP;
		}
		public String getLyiszx() {
			return lyiszx;
		}
		public void setLyiszx(String lyiszx) {
			this.lyiszx = lyiszx;
		}
		public String getJzrole() {
			return jzrole;
		}
		public void setJzrole(String jzrole) {
			this.jzrole = jzrole;
		}
		public String getJzrtj() {
			return jzrtj;
		}
		public void setJzrtj(String jzrtj) {
			this.jzrtj = jzrtj;
		}
		public String getJzywtj() {
			return jzywtj;
		}
		public void setJzywtj(String jzywtj) {
			this.jzywtj = jzywtj;
		}
		public String getJzlogin() {
			return jzlogin;
		}
		public void setJzlogin(String jzlogin) {
			this.jzlogin = jzlogin;
		}
		public Integer getJzlogintext1() {
			return jzlogintext1;
		}
		public void setJzlogintext1(Integer jzlogintext1) {
			this.jzlogintext1 = jzlogintext1;
		}
		public Integer getJzlogintext2() {
			return jzlogintext2;
		}
		public void setJzlogintext2(Integer jzlogintext2) {
			this.jzlogintext2 = jzlogintext2;
		}
		public String getJzAPP() {
			return jzAPP;
		}
		public void setJzAPP(String jzAPP) {
			this.jzAPP = jzAPP;
		}
		public String getJziszx() {
			return jziszx;
		}
		public void setJziszx(String jziszx) {
			this.jziszx = jziszx;
		}
	 
		
		public Integer getJzrzsc() {
			return jzrzsc;
		}

		public void setJzrzsc(Integer jzrzsc) {
			this.jzrzsc = jzrzsc;
		}

		public String getSmscontent() {
			return smscontent;
		}
		public void setSmscontent(String smscontent) {
			this.smscontent = smscontent;
		}
		public String getTfhaoma() {
			return tfhaoma;
		}
		public void setTfhaoma(String tfhaoma) {
			this.tfhaoma = tfhaoma;
		}
		public String getFstype() {
			return fstype;
		}
		public void setFstype(String fstype) {
			this.fstype = fstype;
		}
		
		
}
