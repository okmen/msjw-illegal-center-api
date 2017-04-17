package cn.illegal.bean;

import java.io.Serializable;

public class IllegalInfoClaim  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 544850982022211115L;
	private String illegalNo;
	private String drivingLicenceNo;
	private String agency;
	private String dealType;
	private String licensePlateNo;
	private String licensePlateType;
	private String illegalTime;
	private String illegalAddr;
	private String illegalDesc;
	private Integer punishAmt;
	private Integer punishScore;

	
	

	public Integer getPunishScore() {
		return punishScore;
	}
	public void setPunishScore(Integer punishScore) {
		this.punishScore = punishScore;
	}
	
	

	public String getLicensePlateNo() {
		return licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}
	public String getLicensePlateType() {
		return licensePlateType;
	}
	public void setLicensePlateType(String licensePlateType) {
		this.licensePlateType = licensePlateType;
	}
	public String getIllegalTime() {
		return illegalTime;
	}
	public void setIllegalTime(String illegalTime) {
		this.illegalTime = illegalTime;
	}

	public String getIllegalDesc() {
		return illegalDesc;
	}
	public void setIllegalDesc(String illegalDesc) {
		this.illegalDesc = illegalDesc;
	}


	public Integer getPunishAmt() {
		return punishAmt;
	}
	public void setPunishAmt(Integer punishAmt) {
		this.punishAmt = punishAmt;
	}
	public String getIllegalNo() {
		return illegalNo;
	}
	public void setIllegalNo(String illegalNo) {
		this.illegalNo = illegalNo;
	}
	public String getDrivingLicenceNo() {
		return drivingLicenceNo;
	}
	public void setDrivingLicenceNo(String drivingLicenceNo) {
		this.drivingLicenceNo = drivingLicenceNo;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getIllegalAddr() {
		return illegalAddr;
	}
	public void setIllegalAddr(String illegalAddr) {
		this.illegalAddr = illegalAddr;
	}

}
