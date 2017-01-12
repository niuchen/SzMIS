package com.SzMIS.common.bean;

import java.util.Map;

/**
 * 操作状态类
 * 主要用于service层返回给controller业务执行结果的通用对象 
 *  
   * result 操作结果0 "未知",1"成功",2"失败",3"异常"
   * reuslt_err 操作异常
   * reuslt_hint 返回提示语句
   * reuslt_value 返回的对象
   * **/   
 public class OperateState {
	/**
	 * 操作结果0 "未知",1"成功",2"失败",3"异常"1
	 * **/
  private  int result;
  public static final String resultStr[]={"未知","成功","失败","异常"};
  /**
   * 异常内容
   * **/
  private String reuslt_err;//操作异常
  /**
   * 返回提示语句
   * */
  private String reuslt_hint;//返回提示语句.
  
  /**
   * 返回的对象
   * **/
  private Object reuslt_value;//执行DAO返回的对象。
  
  private long startTime = 0L;//开始时间
  private long endTime = 0L;//结束时间
  /**
   * result 操作结果0 "未知",1"成功",2"失败",3"异常"
   * reuslt_err 操作异常
   * reuslt_hint 返回提示语句
   * reuslt_value 返回的对象
   * **/
  public OperateState(int result, String reuslt_err,String reuslt_hint,Object reuslt_value){
	  this.result=result;
	  this.reuslt_err=reuslt_err;
	  this.reuslt_hint=reuslt_hint;
	  this.reuslt_value=reuslt_value;
   }
  
  public OperateState(int result, String reuslt_err,String reuslt_hint,Object reuslt_value,Long startTime,Long endTime){
	  this.result=result;
	  this.reuslt_err=reuslt_err;
	  this.reuslt_hint=reuslt_hint;
	  this.reuslt_value=reuslt_value;
	  this.startTime=startTime;
	  this.endTime=endTime;
    }
public long getStartTime() {
	return startTime;
}

public void setStartTime(long startTime) {
	this.startTime = startTime;
}

public long getEndTime() {
	return endTime;
}

public void setEndTime(long endTime) {
	this.endTime = endTime;
}

public Object getReuslt_value() {
	return reuslt_value;
}
public void setReuslt_value(Object reuslt_value) {
	this.reuslt_value = reuslt_value;
}
public int getResult() {
	return result;
}
public void setResult(int result) {
	this.result = result;
}
public String getReuslt_err() {
	return reuslt_err;
}
public void setReuslt_err(String reuslt_err) {
	this.reuslt_err = reuslt_err;
}
public String getReuslt_hint() {
	return reuslt_hint;
}
public void setReuslt_hint(String reuslt_hint) {
	this.reuslt_hint = reuslt_hint;
}
public static String[] getResultstr() {
	return resultStr;
}
}
