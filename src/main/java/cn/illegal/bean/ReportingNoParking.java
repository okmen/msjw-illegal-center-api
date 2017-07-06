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
	private String parkingReason;//停车原因
	private String scenePhoto;//大场景1
	private String scenePhoto1;//大场景（含车头正面）
	private String scenePhoto2;//前五米无车场景
	private String scenePhoto3;//后五米无车场景
	private String stopNoticePhoto;//停车告知单拍摄照片
	private String sourceOfCertification;//申请来源
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
	public String getParkingReason() {
		return parkingReason;
	}
	public void setParkingReason(String parkingReason) {
		this.parkingReason = parkingReason;
	}
	public String getScenePhoto() {
		return scenePhoto;
	}
	public void setScenePhoto(String scenePhoto) {
		this.scenePhoto = scenePhoto;
	}
	public String getScenePhoto1() {
		return scenePhoto1;
	}
	public void setScenePhoto1(String scenePhoto1) {
		this.scenePhoto1 = scenePhoto1;
	}
	public String getScenePhoto2() {
		return scenePhoto2;
	}
	public void setScenePhoto2(String scenePhoto2) {
		this.scenePhoto2 = scenePhoto2;
	}
	public String getScenePhoto3() {
		return scenePhoto3;
	}
	public void setScenePhoto3(String scenePhoto3) {
		this.scenePhoto3 = scenePhoto3;
	}
	public String getStopNoticePhoto() {
		return stopNoticePhoto;
	}
	public void setStopNoticePhoto(String stopNoticePhoto) {
		this.stopNoticePhoto = stopNoticePhoto;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	@Override
	public String toString() {
		return "ReportingNoParking [numberPlateNumber=" + numberPlateNumber + ", plateType=" + plateType + ", IDcard="
				+ IDcard + ", parkingSpot=" + parkingSpot + ", parkingReason=" + parkingReason + ", scenePhoto="
				+ scenePhoto + ", scenePhoto1=" + scenePhoto1 + ", scenePhoto2=" + scenePhoto2 + ", scenePhoto3="
				+ scenePhoto3 + ", stopNoticePhoto=" + stopNoticePhoto + ", sourceOfCertification="
				+ sourceOfCertification + "]";
	}
	

}
