package cn.illegal.bean;

import java.io.Serializable;

public class StarsBean implements Serializable{
	private String serialNumber;//流水号
	private String stars;//评价星级
	private String evaluateTime;//评价时间
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}
	public String getEvaluateTime() {
		return evaluateTime;
	}
	public void setEvaluateTime(String evaluateTime) {
		this.evaluateTime = evaluateTime;
	}
	
}
