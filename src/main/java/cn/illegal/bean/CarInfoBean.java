package cn.illegal.bean;

import java.io.Serializable;

public class CarInfoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3615505941884637578L;

	private String licensePlateNo;

	private String licensePlateType;

	private String vehicleIdentifyNoLast4;

	public CarInfoBean(){}
	
	public CarInfoBean(String licensePlateNo, String licensePlateType, String vehicleIdentifyNoLast4) {
		super();
		this.licensePlateNo = licensePlateNo;
		this.licensePlateType = licensePlateType;
		this.vehicleIdentifyNoLast4 = vehicleIdentifyNoLast4;
	}
	
	public void setLicensePlateNo(String licensePlateNo){
	this.licensePlateNo = licensePlateNo;
	}
	public String getLicensePlateNo(){
	return this.licensePlateNo;
	}
	public void setLicensePlateType(String licensePlateType){
	this.licensePlateType = licensePlateType;
	}
	public String getLicensePlateType(){
	return this.licensePlateType;
	}
	public void setVehicleIdentifyNoLast4(String vehicleIdentifyNoLast4){
	this.vehicleIdentifyNoLast4 = vehicleIdentifyNoLast4;
	}
	public String getVehicleIdentifyNoLast4(){
	return this.vehicleIdentifyNoLast4;
	}
}
