package cn.illegal.bean;

import java.io.Serializable;

public class IllegalInfoSheet  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7053070376553983898L;
	private String billNo;
	private String carOwner;
	private String licensePlateNo;
	private String licensePlateType;
	private String drivingLicenceNo;
	private String illegalTime;
	private String illegalAddr;
	private String illegalDesc;
	private Integer punishAmt;
	private Integer punishScore;
	private String dealType;
	private String illegalUnit;
	private Integer totalScore;
	private String agency;
	private String dealPolice;
	private Integer waitingDealNum;
	private String returnMsg;

	
	public Integer getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getDealPolice() {
		return dealPolice;
	}
	public void setDealPolice(String dealPolice) {
		this.dealPolice = dealPolice;
	}
	public Integer getWaitingDealNum() {
		return waitingDealNum;
	}
	public void setWaitingDealNum(Integer waitingDealNum) {
		this.waitingDealNum = waitingDealNum;
	}
	public String getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}


	public Integer getPunishScore() {
		return punishScore;
	}
	public void setPunishScore(Integer punishScore) {
		this.punishScore = punishScore;
	}
	
	
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
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

	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getIllegalUnit() {
		return illegalUnit;
	}
	public void setIllegalUnit(String illegalUnit) {
		this.illegalUnit = illegalUnit;
	}
	public String getDrivingLicenceNo() {
		return drivingLicenceNo;
	}
	public void setDrivingLicenceNo(String drivingLicenceNo) {
		this.drivingLicenceNo = drivingLicenceNo;
	}
	public String getIllegalAddr() {
		return illegalAddr;
	}
	public void setIllegalAddr(String illegalAddr) {
		this.illegalAddr = illegalAddr;
	}
	public Integer getPunishAmt() {
		return punishAmt;
	}
	public void setPunishAmt(Integer punishAmt) {
		this.punishAmt = punishAmt/100;
	}

}
