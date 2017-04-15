package cn.illegal.bean;

import java.io.Serializable;

public class MessageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6914320520980189792L;

	private String subscribeNo;
	private String  businessType;
	private String  reminder;
	
	public String getSubscribeNo() {
		return subscribeNo;
	}
	public void setSubscribeNo(String subscribeNo) {
		this.subscribeNo = subscribeNo;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	

}
