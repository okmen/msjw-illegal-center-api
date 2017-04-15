package cn.illegal.bean;

import java.io.Serializable;

public class AppealInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3513630536586447012L;
	
	private String billNo;
	private String licensePlateNo;
	private String licensePlateType;
	private String illegalTime;
	private String illegalAddress;
	private String illegalDesc;
	private String agency;
	private String claimant;
	private String claimantAddress;
	private String claimantPhone;
	private String appealType;
	private String appealContent;
	private String materialPicture;
	
	public AppealInfoBean(){
		
	}
	
		
	public AppealInfoBean(String billNo, String licensePlateNo, String licensePlateType,String illegalTime, String illegalAddress,
			String illegalDesc, String agency, String claimant,
			String claimantAddress, String claimantPhone, String appealType, String appealContent,
			String materialPicture) {
		super();
		this.billNo = billNo;
		this.licensePlateNo = licensePlateNo;
		this.licensePlateType = licensePlateType;
		this.illegalTime = illegalTime;
		this.illegalAddress = illegalAddress;
		this.illegalDesc = illegalDesc;
		this.agency = agency;
		this.claimant = claimant;
		this.claimantAddress = claimantAddress;
		this.claimantPhone = claimantPhone;
		this.appealType = appealType;
		this.appealContent = appealContent;
		this.materialPicture = materialPicture;
	}



	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getLicensePlateNo() {
		return licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
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

	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getClaimant() {
		return claimant;
	}
	public void setClaimant(String claimant) {
		this.claimant = claimant;
	}
	public String getClaimantAddress() {
		return claimantAddress;
	}
	public void setClaimantAddress(String claimantAddress) {
		this.claimantAddress = claimantAddress;
	}
	public String getClaimantPhone() {
		return claimantPhone;
	}
	public void setClaimantPhone(String claimantPhone) {
		this.claimantPhone = claimantPhone;
	}
	public String getAppealType() {
		return appealType;
	}
	public void setAppealType(String appealType) {
		this.appealType = appealType;
	}
	public String getAppealContent() {
		return appealContent;
	}
	public void setAppealContent(String appealContent) {
		this.appealContent = appealContent;
	}
	public String getMaterialPicture() {
		return materialPicture;
	}
	public void setMaterialPicture(String materialPicture) {
		this.materialPicture = materialPicture;
	}


	public String getLicensePlateType() {
		return licensePlateType;
	}


	public void setLicensePlateType(String licensePlateType) {
		this.licensePlateType = licensePlateType;
	}

	

}
