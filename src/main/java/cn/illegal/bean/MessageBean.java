package cn.illegal.bean;

import java.io.Serializable;

public class MessageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6914320520980189792L;

	private String code;
	private String  message;
	private Object  data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	

	

}
