/**
 * FileName:     MessageAletsByJavaClient.java
 * @Description: TODO(本类封装所有关于ANDROID sendMessage工具类提供给第三方平台使用)
 * All rights Reserved, Designed By 上海神洲数港有限公司
 * Copyright:    Copyright(C) 2011-2012
 * Company       上海神洲数港有限公司 LTD.
 * @author:    chivalrous
 * @version    V1.0 
 * Createdate:         2012-8-26 上午10:56:22
 * Modification  History:
 * Date         Author        Version        Discription
 *  ----------------------------------------------------------------------------------
 * 2012-8-26      chivalrous         1.0             1.0
 * Why & What is modified: <修改原因描述>
 */
package com.SzMIS.common.smssend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

 


/**
 * @ClassName: MessageAletsByJavaClient
 * @Description:TODO(提供JAVA版本客户端实现) 使用说明： 1、必须将
 *                                  {@code AndroidSendMessageJavaClient}进行实例化操作
 *                                  需要传入REST的URL以及HTTP验证帐号密码完成基本初始化工作 2、必须调用
 *                                  {@code AndroidSendMessageJavaClient}
 *                                  的setSendInfoMessage()并且将
 *                                  {@code SendInfoMessag}中所用需要必须初始化的参数全部初始化
 * @author: chivalrous
 * @date: 2012-8-26 上午10:56:22
 */
public class SendMessageJavaClient {

	private Logger log = Logger.getLogger(getClass());

	/**
	 * RestFul的请求地址URL
	 */
	private String hostURl;
	/**
	 * 采用HTTP BASIC AUTHENTICATION 加密帐号
	 */
	private String userName;

	/**
	 * 采用HTTP BASIC AUTHENTICATION 加密密码
	 */
	private String passwd;

	/**
	 * @Title: MessageAletsByJavaClient
	 * @Description: TODO(完成客户端基本参数设置建议第三方将URL写入配置文件)
	 * @param: @param hostURl 请求URL
	 * @param: @param userName 请求用户名
	 * @param: @param passwd 请求验证密码
	 * @throws
	 */
	public SendMessageJavaClient(String hostURl, String userName, String passwd) {
		super();
		this.hostURl = hostURl;
		this.userName = userName;
		this.passwd = passwd;
	}

	/**
	 * 
	 * @Title: sendMessageInfoByPost
	 * @Description: TODO(使用该工具类下需要手动将{@code SendInfoMessage}所用需要配置的字段
	 *               一定必须SET相应的参数（短信内容、业务类型、手机号）)
	 * @param: @param sendInfoMessage
	 * @param: @return
	 * @return: String success(成功) error（失败）
	 * @throws Exception
	 * @throws
	 */
	public String sendMessageInfoByPost(Object o) {
		String output = "error";
		String s;
		try {
			String authString = this.userName + ":" + this.passwd;
			log.info("auth string: " + authString);
			byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
			String authStringEnc = new String(authEncBytes);
			log.info("Base64 encoded auth string: " + authStringEnc);
			// 接口URL
			URL url = new URL(this.hostURl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
			conn.setRequestProperty("Authorization", "Basic " + authStringEnc);
			// 将短信内容转换为JSON字符串进行转码
			String jsonString = JsonUtils.toJson(o);
		//	System.out.println(jsonString);
			log.info(jsonString);
			//
			OutputStream os = conn.getOutputStream();
			os.write(jsonString.getBytes("utf-8"));
			os.flush();
			log.info("" + conn.getResponseCode());

			BufferedReader br = new BufferedReader(new InputStreamReader(	(conn.getInputStream()),
																			"utf-8"));

			System.out.println("Output from Server .... \n");

			while ((s = br.readLine()) != null) {
				output = s;
			}
			System.out.println(output);
			log.info(output);

			conn.disconnect();

		}
		catch (MalformedURLException e) {

			e.printStackTrace();
			log.error(e);

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e);
		}
		return output;
	}
	
	public static void main(String[] args) {
		List<SendInfoMessage> msgs = new ArrayList<SendInfoMessage>();
		SendInfoMessage sendMsg = new SendInfoMessage();
		sendMsg.setDest_terminal_id("13838509886");
		sendMsg.setPid("201610190958101");
		//sendMsg.setLinkid("1");
		  sendMsg.setAct_code("1");
		sendMsg.setMsg_context("testmsg测试消息");
		sendMsg.setRequest_time("2014-06-27 12:10:11");
		sendMsg.setSp_code("10657050110459");
		msgs.add(sendMsg);
		
//		SendInfoMessage sendMsg2 = new SendInfoMessage();
//		sendMsg2.setDest_terminal_id("13838509886");
//		sendMsg2.setPid("201610190958101");
//		//sendMsg.setLinkid("1");
//		sendMsg2.setMsg_context("test msg 测试消息");
//		sendMsg2.setRequest_time("2014-06-27 12:10:11");
//		sendMsg2.setSp_code("10657050110459");
//		msgs.add(sendMsg2);
		String s=new SendMessageJavaClient("http://192.168.32.220:6008/sms/rest/lbt/post/sendMessage", "mkyong", "123456").sendMessageInfoByPost(msgs);
		System.out.println("返回:"+s);
	}

}
