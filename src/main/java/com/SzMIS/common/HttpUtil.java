package com.SzMIS.common;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

 import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;  
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;  
import org.apache.http.client.ClientProtocolException;  
import org.apache.http.client.HttpClient;  
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;  
import org.apache.http.client.methods.HttpPost;  
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;  
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;  
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.SzMIS.common.bean.OperateState;
import com.google.gson.Gson;
 
/**
 * http访问系统HTTP地址接口工具方法
 * 
 *  *  niuchen
 * 2016-9-8
 * ***/

public class HttpUtil {  
	private Logger logger = LoggerFactory.getLogger(this.getClass());
     private HttpClient mClient;  
    private HttpResponse httpresponse = null;  
    private String method="POST", url;  
    private HttpPost httppost = null;
   // private JSONObject json,data;  
    private static final String errorMessage = "有错误存在!";  
    private static final String invalidKeyMessage = "no such key exists!"; 
    private long startTime = 0L;
    private long endTime = 0L;
    public HttpUtil( String url){  
         this.url = url;  
     }  
 
    /**
     * 执行url的HTTP调用  并返回是否完成  
     * params 传递的参数
     * **/
    public OperateState excute(List<NameValuePair> params){  
     //  boolean result=false;
    	String neirong= "";
        try {          
            //	System.out.println(url);
        	    mClient = HttpClientBuilder.create().build();  
            	httppost=new HttpPost(url);
         	    httppost.addHeader("Content-type", "application/x-www-form-urlencoded");  
            	// 设置编码
        	    httppost.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));  
                  startTime = System.currentTimeMillis();
                  //执行HTTP链接
                 httpresponse=mClient.execute(httppost);  
                //获取返回的内容
                 neirong= EntityUtils.toString(httpresponse.getEntity());
                 
            //    System.out.println("返回内容:"+neirong);
                endTime = System.currentTimeMillis();
               // int statusCode = httpresponse.getStatusLine().getStatusCode();
             //     System.out.println(statusCode);
             //   System.out.println("调用API 花费时间(单位：毫秒)：" + (endTime - startTime));
                if(neirong!=null&&!"".equals(neirong)){
                 	 Gson gson = new Gson();  
                     OperateState op = gson.fromJson(neirong, OperateState.class); 
                    // System.out.println(op.getResult()+"----");
                     return op;
                }else{
                    return new OperateState(2, null, "返回参数为空!状态码:"+getStatus()+getStatusCode(), "URL:"+url+"  返回:"+neirong,startTime,endTime);
                }
  //                 Header header = httpresponse.getFirstHeader("Content-Length");
//                 String headerVal = header.getValue();
//                 System.out.println(headerVal);
//                 HttpEntity httpEntity = httpresponse.getEntity();
//                 System.out.println(httpEntity);
                
         } catch (Exception e) {  
             e.printStackTrace();  
             logger.error("HTTP链接接口时异常:"+url+e.getMessage());
             return new OperateState(3, e.getMessage(), "异常!状态码:"+getStatus()+getStatusCode(), "URL:"+url+"  返回:"+neirong,startTime,endTime);
        } 
  
    }  
    /* 
     * 检查返回值是否有效，检查json值是否有效 
     */  
    private boolean checkValid(){  
        return httpresponse == null  ; 
    }  
    /* 
     * 取得服务端回复的状态. 
     */  
    public String getStatus(){  
        if (checkValid()) return errorMessage;  
        return httpresponse.getStatusLine().toString();  
    }  
    /* 
     * 取得状态码 
     */  
    public String getStatusCode(){  
        if (checkValid()) return errorMessage;  
        return Integer.valueOf(httpresponse.getStatusLine().getStatusCode()).toString();  
    }  
//    /* 
//     * 取得返回的message信息 
//     */  
//    public String getMessage(){  
//        if (checkValid()) return errorMessage;  
//        try {  
//            return json.getString("message");  
//        } catch (JSONException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        }  
//        return errorMessage;  
//    }  
    /* 
//     * 返回整个data信息，字符串表示 
//     */  
//    public String getDataString(){  
//        if (checkValid()) return errorMessage;  
//        return data.toString();  
//    }  
//    /* 
//     * 默认返回数据是json格式，主json中有一个子树data，默认data是我们的要处理的json数据 
//     * 此处返回data的一个键key的值 
//     */  
//    public String getDataItem(String key){  
//        if (checkValid()) return errorMessage;  
//        if (data.isNull(key)) return key+": "+invalidKeyMessage;  
//        try {  
//            return data.getString(key);  
//        } catch (JSONException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        }  
//        return errorMessage;  
//    }  

    public static void main(String []d){
    	HttpUtil httpu=new HttpUtil("http://127.0.0.1:8080/SSOserver/Userlogin.action");
      	// 建立一个NameValuePair数组，用于存储欲传送的参数
    	List<NameValuePair> params = new ArrayList<NameValuePair>();
     	// 添加参数
    	params.add(new BasicNameValuePair("username", "1"));
    	params.add(new BasicNameValuePair("userpwd", "1"));
    	params.add(new BasicNameValuePair("mac", "mac3333333333"));
    	params.add(new BasicNameValuePair("md5", "md5555555555"));
    	params.add(new BasicNameValuePair("type", "sample"));
    	httpu.excute(params);
    }
}
