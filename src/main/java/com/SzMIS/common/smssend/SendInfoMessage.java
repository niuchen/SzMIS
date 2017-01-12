/**
 * copyright (c) by shenzhou 2012
 */
package com.SzMIS.common.smssend;

/**
 * 封装发送短信所需的信息实体
 * 
 * @author 丁恒(1184438772@qq.com)
 * @date 2012-11-26
 * 
 */
public class SendInfoMessage {

	private String act_code = "";// 本平台自定义为后期查询所用

	private String sp_code = "";
	/**
	 * 可以为空
	 */
	private String fee_terminal_id = "";
	// 手机号
	private String dest_terminal_id;
	// defalut 1
	private String register_delivery = "1";
	// send message context
	private String msg_context;
	// request time
	private String request_time;
	// default AHA3919901
	private String service_id = "AHA3919901";
	// default 01
	private String free_type = "01";
	// defalut free code 10
	private String free_code = "10";
	// defalut message format 15
	private String msg_format = "15";
	// default msg level 1
	private String msg_level = "1";
	// default ""
	private String valid_time = "";
	// defalut ''
	private String area_code = "HN";

	private String operator_code = "HNYD";

	private String pid = "";

	private String userid = "";

	private String linkid = "";

	/**
	 * @Title: getAct_code <BR>
	 * @Description: 发信息一定填写选项，为统计查询需要 <BR>
	 * @return: String <BR>
	 */
	public String getAct_code() {
		return act_code;
	}

	/**
	 * @Title: setAct_code <BR>
	 * @Description: 发信息一定填写选项，为统计查询需要 <BR>
	 * @return: String <BR>
	 */
	public void setAct_code(String act_code) {
		this.act_code = act_code;
	}

	/**
	 * @Title: getSp_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getSp_code() {
		return sp_code;
	}

	/**
	 * @Title: setSp_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setSp_code(String sp_code) {
		this.sp_code = sp_code;
	}

	/**
	 * @Title: getFee_terminal_id <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getFee_terminal_id() {
		return fee_terminal_id;
	}

	/**
	 * @Title: setFee_terminal_id <BR>
	 * @Description: 收信息人的手机号必须填写 <BR>
	 * @return: String <BR>
	 */
	public void setFee_terminal_id(String fee_terminal_id) {
		this.fee_terminal_id = fee_terminal_id;
	}

	/**
	 * @Title: getDest_terminal_id <BR>
	 * @Description: 收信息人的手机号必须填写 <BR>
	 * @return: String <BR>
	 */
	public String getDest_terminal_id() {
		return dest_terminal_id;
	}

	/**
	 * @Title: setDest_terminal_id <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setDest_terminal_id(String dest_terminal_id) {
		this.dest_terminal_id = dest_terminal_id;
	}

	/**
	 * @Title: getRegister_delivery <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getRegister_delivery() {
		return register_delivery;
	}

	/**
	 * @Title: setRegister_delivery <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setRegister_delivery(String register_delivery) {
		this.register_delivery = register_delivery;
	}

	/**
	 * @Title: getMsg_context <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getMsg_context() {
		return msg_context;
	}

	/**
	 * @Title: setMsg_context <BR>
	 * @Description: 要发送的短信内容 <BR>
	 * @return: String <BR>
	 */
	public void setMsg_context(String msg_context) {
		this.msg_context = msg_context;
	}

	/**
	 * @Title: getRequest_time <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getRequest_time() {
		return request_time;
	}

	/**
	 * @Title: setRequest_time <BR>
	 * @Description: 时间必填 <BR>
	 * @return: String <BR>
	 */
	public void setRequest_time(String request_time) {
		this.request_time = request_time;
	}

	/**
	 * @Title: getService_id <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getService_id() {
		return service_id;
	}

	/**
	 * @Title: setService_id <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}

	/**
	 * @Title: getFree_type <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getFree_type() {
		return free_type;
	}

	/**
	 * @Title: setFree_type <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setFree_type(String free_type) {
		this.free_type = free_type;
	}

	/**
	 * @Title: getFree_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getFree_code() {
		return free_code;
	}

	/**
	 * @Title: setFree_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setFree_code(String free_code) {
		this.free_code = free_code;
	}

	/**
	 * @Title: getMsg_format <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getMsg_format() {
		return msg_format;
	}

	/**
	 * @Title: setMsg_format <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setMsg_format(String msg_format) {
		this.msg_format = msg_format;
	}

	/**
	 * @Title: getMsg_level <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getMsg_level() {
		return msg_level;
	}

	/**
	 * @Title: setMsg_level <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setMsg_level(String msg_level) {
		this.msg_level = msg_level;
	}

	/**
	 * @Title: getValid_time <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getValid_time() {
		return valid_time;
	}

	/**
	 * @Title: setValid_time <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setValid_time(String valid_time) {
		this.valid_time = valid_time;
	}

	/**
	 * @Title: getArea_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getArea_code() {
		return area_code;
	}

	/**
	 * @Title: setArea_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	/**
	 * @Title: getOperator_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getOperator_code() {
		return operator_code;
	}

	/**
	 * @Title: setOperator_code <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setOperator_code(String operator_code) {
		this.operator_code = operator_code;
	}

	/**
	 * @Title: getPid <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * @Title: setPid <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * @Title: getUserid <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @Title: setUserid <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @Title: getLinkid <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getLinkid() {
		return linkid;
	}

	/**
	 * @Title: setLinkid <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setLinkid(String linkid) {
		this.linkid = linkid;
	}

	/**
	 * <p>
	 * Title: toString
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SendInfoMessage [act_code="
				+ act_code
				+ ", sp_code="
				+ sp_code
				+ ", fee_terminal_id="
				+ fee_terminal_id
				+ ", dest_terminal_id="
				+ dest_terminal_id
				+ ", register_delivery="
				+ register_delivery
				+ ", msg_context="
				+ msg_context
				+ ", request_time="
				+ request_time
				+ ", service_id="
				+ service_id
				+ ", free_type="
				+ free_type
				+ ", free_code="
				+ free_code
				+ ", msg_format="
				+ msg_format
				+ ", msg_level="
				+ msg_level
				+ ", valid_time="
				+ valid_time
				+ ", area_code="
				+ area_code
				+ ", operator_code="
				+ operator_code
				+ ", pid="
				+ pid
				+ ", userid="
				+ userid
				+ ", linkid="
				+ linkid
				+ "]";
	}
}
