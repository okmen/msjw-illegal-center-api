package cn.illegal.bean;

import java.io.Serializable;

public class ParamRequestBean implements Serializable  {
		/**
	 * 
	 */
	private static final long serialVersionUID = 2272309121507003442L;

		private String partnerCode;

		private String partnerUserId;

		private String serialNo;

		private String timeStamp;

		private String macAlg;

		private String mac;

		private Object data;

		
		public ParamRequestBean(String partnerCode,String partnerUserId,String serialNo,String timeStamp,String macAlg,String mac,Object data){
			this.partnerCode=partnerCode;
			this.partnerUserId=partnerUserId;
			this.serialNo=serialNo;
			this.timeStamp=timeStamp;
			this.macAlg=macAlg;
			this.mac=mac;
			this.data=data;
			
		}
		
		
		public ParamRequestBean(){};
		
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
		public void setData(Object data){
		this.data = data;
		}
		public Object getData(){
		return this.data;
		}

		@Override
		public String toString() {
			return "ParamRequestBean [partnerCode=" + partnerCode + ", partnerUserId=" + partnerUserId + ", serialNo="
					+ serialNo + ", timeStamp=" + timeStamp + ", macAlg=" + macAlg + ", mac=" + mac + ", data=" + data
					+ "]";
		}

}
