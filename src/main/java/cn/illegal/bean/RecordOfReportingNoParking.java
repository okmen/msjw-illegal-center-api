package cn.illegal.bean;

import java.io.Serializable;

public class RecordOfReportingNoParking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderNumber;//序号
	private String numberPlateNumber;//号牌号码
	private String plateType;//号牌种类
	private String parkingSpot;//停车地点
	private String parkingReason;//停车原因
	private String reportTime;//申请时间
	private String sourceOfCertification;//申请来源
	private String IDcard;//申请身份证号码
	private String state;//处理状态
	private String description;//处理描述
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getNumberPlateNumber() {
		return numberPlateNumber;
	}
	public void setNumberPlateNumber(String numberPlateNumber) {
		this.numberPlateNumber = numberPlateNumber;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(String parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	public String getParkingReason() {
		return parkingReason;
	}
	public void setParkingReason(String parkingReason) {
		this.parkingReason = parkingReason;
	}
	public String getReportTime() {
		return reportTime;
	}
	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String IDcard) {
		this.IDcard = IDcard;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "RecordOfReportingNoParking [orderNumber=" + orderNumber + ", numberPlateNumber=" + numberPlateNumber
				+ ", plateType=" + plateType + ", parkingSpot=" + parkingSpot + ", parkingReason=" + parkingReason
				+ ", reportTime=" + reportTime + ", sourceOfCertification=" + sourceOfCertification + ", IDcard="
				+ IDcard + ", state=" + state + ", description=" + description + "]";
	}

	
}
