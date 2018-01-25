package cn.illegal.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class ElectronicReceiptBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7770935258186170146L;
	private String billNo;//缴款编号
	private String companyName;//执收单位名称
	private String writeOffDate;//时间
	private Integer amt;//金额	单位为分
	private String chargeItem;//收费项目
	private String payWay;//NETBANK-网银支付；WECHAT-微信支付；ALIPAY_APP-支付宝钱包
	private String projectNo;//执收项目编码
	
	private String paymentor;//缴款单位/人
	private String sdb;//银行流水号
	
	private Integer delayAmt;//滞纳金
	private String illegalDesc;//罚款原因
	
	private String licenseType;//车辆类型
	
	
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
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

	public String getChargeItem() {
		return chargeItem;
	}
	public void setChargeItem(String chargeItem) {
		this.chargeItem = chargeItem;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt/100;
	}
	public String getPayWay() {
		return payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	public String getPaymentor() {
		return paymentor;
	}
	public void setPaymentor(String paymentor) {
		this.paymentor = paymentor;
	}
	public String getSdb() {
		return sdb;
	}
	public void setSdb(String sdb) {
		this.sdb = sdb;
	}

	public String toString(){
		return ReflectionToStringBuilder.toString(this); 
	}
	public Integer getDelayAmt() {
		return delayAmt;
	}
	public void setDelayAmt(Integer delayAmt) {
		this.delayAmt = delayAmt/100;
	}
	public String getIllegalDesc() {
		return illegalDesc;
	}
	public void setIllegalDesc(String illegalDesc) {
		this.illegalDesc = illegalDesc;
	}
}
