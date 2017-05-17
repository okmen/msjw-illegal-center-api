package cn.illegal.service;

import java.util.List;
import java.util.Map;

import cn.illegal.bean.AppealInfoBack;
import cn.illegal.bean.AppealInfoBean;
import cn.illegal.bean.CarInfoBean;
import cn.illegal.bean.CustInfoBean;
import cn.illegal.bean.IllegalInfoBean;
import cn.illegal.bean.IllegalInfoSheet;
import cn.illegal.bean.IllegalProcessPointBean;

import cn.illegal.bean.SubcribeBean;
import cn.sdk.bean.BaseBean;

/**
 * @author lutaijun
 */
public interface IIllegalService {
	
	
	public String getMsg(String msg);
	
	public String custRegInfoReceive(CustInfoBean custInfo ,List<CarInfoBean> carInfo,String openId)throws Exception;
	
	public List<IllegalInfoBean> queryInfoByLicensePlateNo(String licensePlateNo,String licensePlateType,String vehicleIdentifyNoLast4,String openId)throws Exception;
	
	public List<IllegalInfoBean> queryInfoByDrivingLicenceNo(String drivingLicenceNo,String recordNo,String openId)throws Exception;
	
	public BaseBean trafficIllegalClaimBefore(String licensePlateNo, String licensePlateType, String mobilephone,String openId)throws Exception;
	
	public IllegalInfoSheet trafficIllegalClaim(String illegalNo,String openId)throws Exception;
	
	public String toQueryPunishmentPage(String billNo,String  licensePlateNo,String mobilephone,String openId) throws Exception;
	
	public String qrCodeToQueryPage(String userName, String traffData, String mobileNo,String openId)throws Exception;
	
	public String callback(String traffData) throws Exception;
	
	public String toPayPage(String illegalNo,String licensePlateNo, String mobileNo,String openId) throws Exception;
	
	public String isRegisterUser(String openId)throws Exception;
	
	public List<IllegalProcessPointBean> getIllegalProcessingPoint() throws Exception;
	
	public BaseBean toChangeSubscribe(String snm,String cldbmid,String cczb_id,CustInfoBean custInfo,CarInfoBean carInfo,String sourceType) throws Exception;
	
	public BaseBean toCancleSubscribe(String subscribeNo) throws Exception;
	
	public List<SubcribeBean> querySubscribe(String licensePlateNo,int  licensePlateType,String mobilephone) throws Exception;
	
	public Map toGetSubscribeSorts(String cldbmid) throws Exception;
	
	public BaseBean trafficIllegalAppeal(AppealInfoBean info,String identityCard,String userCode,String sourceType) throws Exception;
	
	public List<AppealInfoBack> trafficIllegalAppealFeedback(String identityCard,String sourceType) throws Exception;
	
	public BaseBean  trafficIllegalClaimReg(CustInfoBean custInfo, CarInfoBean carInfo,String openId)throws Exception;
}
