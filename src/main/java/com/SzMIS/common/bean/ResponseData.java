package com.SzMIS.common.bean;

import java.util.List;

/**
 * 客户端数据
 * @author sunjuncai
 * @date 2014-8-20
 * @param <T>
 */
public class ResponseData<T> {
	
	/**
     * 数据
     */
    private T data = null;
    
    /**
	 * 响应时间
	 */
	private String responseTime = null;
	
	/**
     * 是否成功
     */
    private Boolean success = false;
    
    /**
     * 提示信息
     */
    private String message = null;
    
    /**
     * 异常消息
     */
    private String errorMsg = null;
    
    /**
     * 数据组 不需要分页时可用
     */
    private List<?> dataList;
    

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<?> getDataList() {
		return dataList;
	}

	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}
    
}