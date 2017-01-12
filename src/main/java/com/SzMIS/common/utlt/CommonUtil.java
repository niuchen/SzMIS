package com.SzMIS.common.utlt;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.util.StringUtils;


 
import com.google.gson.Gson;



/**
 * 公共方法
 * @author sunjuncai
 * @date 2014-8-26
 */
public class CommonUtil {
	
	/** 一天时间 */
	private static final int ONE_DAY_TIME = 1;
	
	private static final String[] WEEK = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
	/** 上午上班时间 */
	private static final String AM_START_WORK_TIME = "am_start_work_time";
	
	/** 上午下班时间 */
	private static final String AM_OFF_WORK_TIME = "am_off_work_time";
	
	/** 下午上班时间 */
	private static final String PM_START_WORK_TIME = "pm_start_work_time";
	
	/** 下午下班时间 */
	private static final String PM_OFF_WORK_TIME = "pm_off_work_time";
	/**
	 * 是否为空的Map
	 * @param map
	 * @return
	 */
	public static boolean isNullMap(Map<String, ?> map){
		if(null != map && !map.isEmpty()){
			return false;
		}
		return true;
	}
	
	/**
	 * 判断字符串是否为null
	 * 
	 * @param str
	 * @return null true
	 */
	public static boolean isNull(String str) {
		if (null != str && !str.trim().equals("")) {
			return false;
		}
		return true;
	}
	
	/**
	 * 是否为空集合
	 * @param list
	 * @return
	 */
	public static boolean isNullCollect(Collection<?> collection){
		if(null != collection && !collection.isEmpty() && collection.size() >0){
			return false;
		}
		return true;
	}
	
	/**
	 * Object 对象转换为字符串
	 * @param obj
	 * @return
	 */
	public static String objToStr(Object obj){
		if(null == obj){
			return "";
		}else{
			return obj.toString();
		}
	}
	
	/**
	 * 格式化时间
	 * @param time
	 * @return
	 */
	public static String parseFormatTime(String time){
		if(!StringUtils.isEmpty(time)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
			Date today = null;
			try {
				today = sdf.parse(time);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(null != today){
				return sdf.format(today);
			}
		}
		return null;
	}
	
	/**
	 * 获取两个日期相差的天数
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static long getBetweenMin(String startTime,String endTime){
		long betweenTime = 0;
		if(!StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)){
			int length = "yyyy-MM-dd HH:mm:ss".length();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			try {
				if(startTime.length() != length){
					startTime = startTime+":59";
				}
				if(endTime.length() != length){
					endTime = endTime+":59";
				}
				Date startDate = sdf.parse(startTime);
				Date endDate = sdf.parse(endTime);
				betweenTime = (endDate.getTime()-startDate.getTime())/(1000*60);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return betweenTime;
	}
	
	public static void main(String[] args) {
		System.out.println(getBetweenMin("2015-11-03 7:14:07","2015-11-03 09:09:35"));
	}
	
	/**
	 * JSON转换为列表
	 * @param <E>
	 * @param json
	 * @param _class
	 * @return
	 */
	public static <E> ArrayList<E> jsonToList(String json, Class _class){
		if(json==null||"".equals(json)||"null".equals(json)){
			return new ArrayList<E>();
		}
		Gson gson = new Gson();  
  		ArrayList<E> list = gson.fromJson(json,_class);  
		return list;
	}
	
	/**
	 * 列表转Json
	 * @param <E>
	 * @param <E>
	 * @param List<E>
	 * @param json
	 * @return
	 */
	public static <E> String ListToJson(List<E> list)
	{
		if(null == list || list.size()== 0)
		{
			return "";
		}
		Gson gson = new Gson();  
 		 
		return gson.toJson(list);
	}
	
	/**
	 * JSON转换为实体类
	 * @param <E>
	 * @param json
	 * @param _class
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static<T> Object jsonToObject(String json, Class<T> _class){
		if(json==null||"".equals(json)||"null".equals(json)){
			return null;
		}
		try{  
			Gson gson = new Gson();  
		    Object pojo;  
		    pojo =  gson.fromJson(json,_class);
  		    return (T)pojo;  
		}catch(Exception ex){  
		    ex.printStackTrace();  
		    return null;  
		} 
		
	}
	
	/**
	 * 1超过一天 昨天
	 * 2超过两天 显示星期 
	 * 3超过一周 显示月日
	 * @param dataTime
	 * @param nowTime
	 * @return
	 */
	public static String formatShowTime(String dataTime,String nowTime){
		//显示的时间
		String showTime = dataTime;
		ServerTime startST = new ServerTime(dataTime);
		ServerTime endST = new ServerTime(nowTime);
		
		int startDay = startST.getDay();
		int endDay = endST.getDay();
		
		//今天
		if(endDay == startDay){
			int startMin = startST.getMinutes();
			int endMin = endST.getMinutes();
			if(endMin - startMin >= 29){
				showTime = endMin - startMin +"分钟前";
				return showTime;
			}else if(endMin - startMin == 30){
				showTime = endMin - startMin +"半小时前";
				return showTime;
			}else{
				showTime = "今天"+ formatTime(dataTime, " HH:mm");
				return showTime;
			}
		}
		if(endDay == startDay + ONE_DAY_TIME){
			showTime = "昨天"+ formatTime(dataTime, " HH:mm");
			return showTime;
		} 
		
		int startWeek = startST.getWeek();
		int endWeek = endST.getWeek();
		if(startWeek ==  endWeek){
			showTime = startST.getWeekName();
			return showTime;
		}
		
		int startYear = startST.getYear();
		int endYear = endST.getYear();
		
		if(endYear == startYear){
			//一年内
			showTime = formatTime(dataTime, "MM月dd日 HH:mm");
			return showTime;
		}else{
			//超过一年
			showTime = formatTime(dataTime, "MM-dd-yyyy");
			return showTime;
		}
	}
	
	/**
	 * 根据提供的格式转换
	 * @param time
	 * @param format
	 * @return
	 */
	public static String formatTime(String time,String format){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		String formatTime = null;
		try {
			formatTime = sdf2.format(sdf.parse(time));
		} catch (ParseException e) {
			e.printStackTrace();
			formatTime = time;
		}
		return formatTime;
	}
	
	/**
     * 判断是否在提交数据的时间范围
     */
    public static boolean isAtTime(){
    	Properties properties = CommonUtil.loadProperty();
    	String am_start_work_time = properties.getProperty(AM_START_WORK_TIME);
    	String am_off_work_time = properties.getProperty(AM_OFF_WORK_TIME);
    	String pm_start_work_time = properties.getProperty(PM_START_WORK_TIME);
    	String pm_off_work_time = properties.getProperty(PM_OFF_WORK_TIME);
    	try{
			//在8点至12点，14点至17点半
			Date date = new Date();
			SimpleDateFormat sdFormat = new SimpleDateFormat("HHmm");
			String str = sdFormat.format(date);
			date = sdFormat.parse(str);
			Date amStart = sdFormat.parse(am_start_work_time);
			Date amEnd = sdFormat.parse(am_off_work_time);
			Date pmStart = sdFormat.parse(pm_start_work_time);
			Date pmEnd = sdFormat.parse(pm_off_work_time);
			if( (date.after(amStart) && date.before(amEnd)) || (date.after(pmStart) && date.before(pmEnd)) ){
				return true;
			}else{
				return false;
			}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return false;
    }
	public static Properties loadProperty(){
		Properties pro = new Properties();
		InputStream inputStream = new CommonUtil().getClass().getResourceAsStream("/Timer.properties");
		try {
			pro.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;
	}
    /**
	 * 检查经纬度值是否正确
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	public static boolean checkJWNum(Double longitude,Double latitude){
		if((longitude !=null && latitude !=null) && (longitude != 4.9E-324 && latitude != 4.9E-324) && (longitude !=0.0 && latitude !=0.0) && (longitude != -180 && latitude != -180)){
			//值正常
			return true;
		}
		longitude = null;
		latitude = null;
		return false;
	}
	public static Properties getJPuhConfig(){
		Properties properties = new Properties();
		try {
			properties.load(CommonUtil.class.getResourceAsStream("jpush.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	/**
	 * 根据key 获取配置的value
	 * 
	 * @param key
	 * @return
	 */
	public static String getJPushPropValue(String key) {
		return getJPuhConfig().getProperty(key);
	}
}
