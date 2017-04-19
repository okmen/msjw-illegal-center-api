package cn.illegal.service;

import java.util.List;

import cn.illegal.bean.AppealInfoBack;
import cn.illegal.bean.AppealInfoBean;
import cn.illegal.bean.CarInfoBean;
import cn.illegal.bean.CustInfoBean;
import cn.illegal.bean.IllegalInfoBean;
import cn.illegal.bean.IllegalInfoClaim;
import cn.illegal.bean.IllegalInfoSheet;
import cn.illegal.bean.IllegalProcessPointBean;
import cn.illegal.bean.ReservationDay;

import cn.illegal.bean.SubcribeBean;
import cn.sdk.bean.BaseBean;

/**
 * @author lutaijun
 */
public interface IIllegalService {
	
	
	public String getMsg(String msg);
	
	public String custRegInfoReceive(CustInfoBean custInfo ,List<CarInfoBean> carInfo);
	
	public List<IllegalInfoBean> queryInfoByLicensePlateNo(String licensePlateNo,String licensePlateType,String vehicleIdentifyNoLast4);
	
	public List<IllegalInfoBean> queryInfoByDrivingLicenceNo(String drivingLicenceNo,String recordNo);
	
	public List<IllegalInfoClaim> trafficIllegalClaimBefore(String licensePlateNo, String licensePlateType, String mobilephone);
	
	public IllegalInfoSheet trafficIllegalClaim(String illegalNo);
	
	public String toQueryPunishmentPage(String billNo,String  licensePlateNo,String mobilephone);
	
	public String toPayPage(String illegalNo,String licensePlateNo, String mobileNo);
	
	public String isRegisterUser();
	
	public List<IllegalProcessPointBean> getIllegalProcessingPoint();
	
	public String toChangeSubscribe(String snm,String cldbmid,String cczb_id,CustInfoBean custInfo,CarInfoBean carInfo,String sourceType);
	
	public String toCancleSubscribe(String subscribeNo);
	
	public List<SubcribeBean> querySubscribe(String licensePlateNo,String  licensePlateType,String mobilephone);
	
	public  List<ReservationDay> toGetSubscribeSorts(String cldbmid);
	
	public String trafficIllegalAppeal(AppealInfoBean info,String identityCard,String userCode,String sourceType);
	
	public AppealInfoBack trafficIllegalAppealFeedback(String identityCard,String sourceType);
	
	public BaseBean  trafficIllegalClaimReg(CustInfoBean custInfo, CarInfoBean carInfo);
}
