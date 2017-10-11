package cn.illegal.service;

import java.util.List;
import java.util.Map;

import cn.illegal.bean.AppealInfoBack;
import cn.illegal.bean.AppealInfoBean;
import cn.illegal.bean.CarInfoBean;
import cn.illegal.bean.CustInfoBean;
import cn.illegal.bean.ElectronicReceiptBean;
import cn.illegal.bean.IllegalInfoBean;
import cn.illegal.bean.IllegalInfoSheet;
import cn.illegal.bean.IllegalProcessPointBean;
import cn.illegal.bean.ReportingNoParking;
import cn.illegal.bean.SubcribeBean;
import cn.sdk.bean.BaseBean;

/**
 * @author lutaijun
 */
public interface IIllegalService {
	
	
	public String getMsg(String msg);
	
	public String custRegInfoReceive(CustInfoBean custInfo ,List<CarInfoBean> carInfo,String openId,String sourceOfCertification)throws Exception;
	
	public BaseBean queryInfoByLicensePlateNo(String licensePlateNo,String licensePlateType,String vehicleIdentifyNoLast4,String openId,String sourceOfCertification)throws Exception;
	public BaseBean queryInfoByLicensePlateNo1(String licensePlateNo,String licensePlateType,String vehicleIdentifyNoLast4,String openId,String sourceOfCertification)throws Exception;
	
	public List<IllegalInfoBean> queryInfoByDrivingLicenceNo(String drivingLicenceNo,String recordNo,String openId,String sourceOfCertification)throws Exception;
	
	public BaseBean trafficIllegalClaimBefore(String licensePlateNo, String licensePlateType, String mobilephone,String openId,String sourceOfCertification)throws Exception;
	
	public IllegalInfoSheet trafficIllegalClaim(String illegalNo,String openId,String sourceOfCertification)throws Exception;
	
	public String toQueryPunishmentPage(String billNo,String  licensePlateNo,String mobilephone,String openId,String sourceOfCertification) throws Exception;
	
	public String qrCodeToQueryPage(String userName, String traffData, String mobileNo,String openId,String sourceOfCertification)throws Exception;
	
	public String callback(String traffData) throws Exception;
	
	public String toPayPage(String billNo,String licensePlateNo, String mobileNo,String openId,String sourceOfCertification) throws Exception;
	
	public String isRegisterUser(String openId,String sourceOfCertification)throws Exception;
	
	public List<IllegalProcessPointBean> getIllegalProcessingPoint() throws Exception;
	
	public BaseBean toChangeSubscribe(String snm,String cldbmid,String cczb_id,CustInfoBean custInfo,CarInfoBean carInfo,String sourceType) throws Exception;
	
	public BaseBean toCancleSubscribe(String subscribeNo) throws Exception;
	
	public List<SubcribeBean> querySubscribe(String licensePlateNo,int  licensePlateType,String mobilephone) throws Exception;
	
	public Map toGetSubscribeSorts(String cldbmid) throws Exception;
	
	public BaseBean trafficIllegalAppeal(AppealInfoBean info,String identityCard,String userCode,String sourceType) throws Exception;
	
	public List<AppealInfoBack> trafficIllegalAppealFeedback(String identityCard,String sourceType) throws Exception;
	
	public BaseBean  trafficIllegalClaimReg(CustInfoBean custInfo, CarInfoBean carInfo,String openId,String sourceOfCertification)throws Exception;
	/**
	 * 违法图片查询
	 * @param imgQueryCode
	 * @return
	 * @throws Exception
	 */

	public List<String> illegalPictureQuery(String imgQueryCode,String sourceOfCertification)throws Exception ;


	/**
	 * 车辆临时停车违停申报
	 * @param reportingNoParkin
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> reportingNoParking(ReportingNoParking reportingNoParking)throws Exception;
	/**
	 * 单宗违停申报查询
	 * @param orderNumber
	 * @param numberPlateNumber
	 * @param plateType
	 * @param sourceOfCertification
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> singleQueryOfReportingNoParking(String orderNumber ,String numberPlateNumber ,String plateType ,String sourceOfCertification) throws Exception;
	/**
	 * 违停申报列表查询
	 * @param numberPlateNumber
	 * @param plateType
	 * @param sourceOfCertification
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> recordOfReportingNoParking(String numberPlateNumber ,String plateType ,String sourceOfCertification) throws Exception;


	
	/**
	 * 电子回单查询
	 * @param billNo
	 * @param licensePlateNo
	 * @param drivingLicenceNo
	 * @param openId
	 * @return
	 */
	public BaseBean toQueryElectronicReceiptPage(String billNo, String licensePlateNo, String idNo,String sourceOfCertification)throws Exception ;

	
	/**
	 * 查询电子印章
	 * @throws Exception 
	 * @throws Exception 
	 * @param orderId  银行流水号
	 */
	public String szTrafficPoliceElecBillQry(String orderId) throws Exception;
}
