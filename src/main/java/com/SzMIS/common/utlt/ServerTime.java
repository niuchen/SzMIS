package com.SzMIS.common.utlt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 服务器时间
 * @author sunjuncai
 *
 */
public class ServerTime {
	
	/** 服务器时间 */
	private String time;

	/** 年 */
	private int year;
	
	/** 月 */
	private int month;
	
	/** 日 */
	private int day;
	
	/** 时 */
	private int hours;

	/** 第几周 */
	private int week;
	
	/** 分 */
	private int minutes;
	
	/** 星期几 */
	private String weekName;
	
	private static String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
	
	public ServerTime(String time) {
		super();
		this.time = time;
		reset();
	}
	
	private void reset(){
		Date today = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
		try {
			today = sdf.parse(time);
			setTime(sdf.format(today));
			Calendar cal = Calendar.getInstance();
			//指定星期一为一周的第一天
			cal.setFirstDayOfWeek(Calendar.MONDAY);
			cal.setTime(today);
			//获取年份
			setYear(cal.get(Calendar.YEAR));
			//获取月份 
			setMonth(cal.get(Calendar.MONTH)+1);
			//获取日 
			setDay(cal.get(Calendar.DATE));
		    //小时 
			setHours(cal.get(Calendar.HOUR_OF_DAY));
			//分 
			setMinutes(cal.get(Calendar.MINUTE));
			//星期几
			setWeekName(weekDays[cal.get(Calendar.DAY_OF_WEEK) - 1]);
			//第几周
			setWeek(cal.get(Calendar.WEEK_OF_YEAR));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWeekName() {
		return weekName;
	}

	public void setWeekName(String weekName) {
		this.weekName = weekName;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getWeek() {
		return week;
	}
	
}
