package cn.illegal.bean;

public class ResultReturnBean {
	private String partnerCode;

	private String partnerUserId;

	private String serialNo;

	private String timeStamp;

	private String macAlg;

	private String mac;

	private String respCode;

	private String respMsg;

	private String data;

	public void setPartnerCode(String partnerCode){
	this.partnerCode = partnerCode;
	}
	public String getPartnerCode(){
	return this.partnerCode;
	}
	public void setPartnerUserId(String partnerUserId){
	this.partnerUserId = partnerUserId;
	}
	public String getPartnerUserId(){
	return this.partnerUserId;
	}
	public void setSerialNo(String serialNo){
	this.serialNo = serialNo;
	}
	public String getSerialNo(){
	return this.serialNo;
	}
	public void setTimeStamp(String timeStamp){
	this.timeStamp = timeStamp;
	}
	public String getTimeStamp(){
	return this.timeStamp;
	}
	public void setMacAlg(String macAlg){
	this.macAlg = macAlg;
	}
	public String getMacAlg(){
	return this.macAlg;
	}
	public void setMac(String mac){
	this.mac = mac;
	}
	public String getMac(){
	return this.mac;
	}
	public void setRespCode(String respCode){
	this.respCode = respCode;
	}
	public String getRespCode(){
	return this.respCode;
	}
	public void setRespMsg(String respMsg){
	this.respMsg = respMsg;
	}
	public String getRespMsg(){
	return this.respMsg;
	}
	public void setData(String data){
	this.data = data;
	}
	public String getData(){
	return this.data;
	}
}
