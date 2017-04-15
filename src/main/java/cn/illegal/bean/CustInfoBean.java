package cn.illegal.bean;

public class CustInfoBean {
	private String custName;

	private String certificateNo;

	private String certificateType;

	private String mobileNo;
	
	private String drivingLicenceNo;

	public CustInfoBean(String custName, String certificateNo, String certificateType, String mobileNo,
			String drivingLicenceNo) {
		super();
		this.custName = custName;
		this.certificateNo = certificateNo;
		this.certificateType = certificateType;
		this.mobileNo = mobileNo;
		this.drivingLicenceNo = drivingLicenceNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDrivingLicenceNo() {
		return drivingLicenceNo;
	}

	public void setDrivingLicenceNo(String drivingLicenceNo) {
		this.drivingLicenceNo = drivingLicenceNo;
	}
	
}
