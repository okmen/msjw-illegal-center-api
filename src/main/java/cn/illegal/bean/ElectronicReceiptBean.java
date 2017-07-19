package cn.illegal.bean;

import java.io.Serializable;

public class ElectronicReceiptBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7770935258186170146L;
	private String billNo;
	private String plateNo;
	private String companyName;
	private String projectNo;
	private String writeOffDate;
	private String driverNo;
	private String chargeItem;
	private String amt;
	private String payWay;//NETBANK-网银支付；WECHAT-微信支付；ALIPAY_APP-支付宝钱包
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getWriteOffDate() {
		return writeOffDate;
	}
	public void setWriteOffDate(String writeOffDate) {
		this.writeOffDate = writeOffDate;
	}
	public String getDriverNo() {
		return driverNo;
	}
	public void setDriverNo(String driverNo) {
		this.driverNo = driverNo;
	}
	public String getChargeItem() {
		return chargeItem;
	}
	public void setChargeItem(String chargeItem) {
		this.chargeItem = chargeItem;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getPayWay() {
		return payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	@Override
	public String toString() {
		return "ElectronicReceiptBean [billNo=" + billNo + ", plateNo=" + plateNo + ", companyName=" + companyName
				+ ", projectNo=" + projectNo + ", writeOffDate=" + writeOffDate + ", driverNo=" + driverNo
				+ ", chargeItem=" + chargeItem + ", amt=" + amt + ", payWay=" + payWay + "]";
	}

}
