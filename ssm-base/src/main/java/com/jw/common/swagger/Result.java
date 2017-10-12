package com.jw.common.swagger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 返回前段数据封装类
 * 
 * @author lhzissky
 *
 */
public class Result <T> {

	/** 返回码 */
	private int resultCode;
	
	/** 返回消息 */
	private String resultMessage;
	
	/** 返回结果数据 */
	private T resultJson;
	
//	private static SerializeConfig mapping = new SerializeConfig();  
//	private static String dateFormat;  
//	static {  
//	    dateFormat = "yyyy-MM-dd HH:mm:ss";  
//	    mapping.put(Date.class, new SimpleDateFormatSerializer(dateFormat));  
//	} 

	public Result(int code, String message, T resultJson) {
		this.resultCode = code;
		this.resultMessage = message;	
		this.resultJson = resultJson;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public T getResultJson() {
		return resultJson;
	}

	public void setResultJson(T resultJson) {
		this.resultJson = resultJson;
	}
	
	@Override
	public String toString() {
		return JSON.toJSONString(this, SerializerFeature.WriteDateUseDateFormat);
	}
	
}
