package cn.illegal.bean;

import java.io.Serializable;

public class ReportingNoParking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numberPlateNumber;//号牌号码
	private String plateType;//号牌种类
	private String IDcard;//星级用户身份证号
	private String parkingSpot;//停车地点
	private String scenePhoto;//驾离后照片
	private String sourceOfCertification;//申请来源
	private String openId;//openId或支付宝号
	public String getNumberPlateNumber() {
		return numberPlateNumber;
	}
	public void setNumberPlateNumber(String numberPlateNumber) {
		this.numberPlateNumber = numberPlateNumber;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(String parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	public String getScenePhoto() {
		return scenePhoto;
	}
	public void setScenePhoto(String scenePhoto) {
		this.scenePhoto = scenePhoto;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	@Override
	public String toString() {
		return "ReportingNoParking [numberPlateNumber=" + numberPlateNumber + ", plateType=" + plateType + ", IDcard="
				+ IDcard + ", parkingSpot=" + parkingSpot + ", scenePhoto=" + scenePhoto + ", sourceOfCertification="
				+ sourceOfCertification + ", openId=" + openId + "]";
	}
	
}
