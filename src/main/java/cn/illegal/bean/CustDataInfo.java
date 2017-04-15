package cn.illegal.bean;

import java.util.List;

public class CustDataInfo {
	private CustInfoBean custInfo;

	private List<CarInfoBean> carInfo ;

	public void setCustInfo(CustInfoBean custInfo){
		
	this.custInfo = custInfo;
	}
	public CustInfoBean getCustInfo(){
	return this.custInfo;
	}
	public void setCarInfo(List<CarInfoBean> carInfo){
	this.carInfo = carInfo;
	}
	public List<CarInfoBean> getCarInfo(){
	return this.carInfo;
	}

}