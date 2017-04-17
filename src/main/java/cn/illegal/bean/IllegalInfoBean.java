package cn.illegal.bean;

import java.io.Serializable;

public class IllegalInfoBean  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 544850982022211115L;
	private String billNo;
	private String carOwner;
	private String licensePlateNo;
	private String licensePlateType;
	private String illegalTime;
	private String illegalAddress;
	private String illegalDesc;
	private Integer punishAmt;
	private Integer punishScore;
	private String isNeedClaim;
	private String illegalUnit;
	private String imgQueryCode;
	private String  description;
	
	

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
	public String getIllegalAddress() {
		return illegalAddress;
	}
	public void setIllegalAddress(String illegalAddress) {
		this.illegalAddress = illegalAddress;
	}
	public String getIllegalDesc() {
		return illegalDesc;
	}
	public void setIllegalDesc(String illegalDesc) {
		this.illegalDesc = illegalDesc;
	}


	public String getIllegalUnit() {
		return illegalUnit;
	}
	public void setIllegalUnit(String illegalUnit) {
		this.illegalUnit = illegalUnit;
	}
	public Integer getPunishAmt() {
		return punishAmt;
	}
	public void setPunishAmt(Integer punishAmt) {
		this.punishAmt = punishAmt;
	}
	public String getIsNeedClaim() {
		return isNeedClaim;
	}
	public void setIsNeedClaim(String isNeedClaim) {
		this.isNeedClaim = isNeedClaim;
	}
	public String getImgQueryCode() {
		return imgQueryCode;
	}
	public void setImgQueryCode(String imgQueryCode) {
		this.imgQueryCode = imgQueryCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}