package cn.illegal.bean;

import java.io.Serializable;
import java.util.List;

public class IllegalBusiness implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3077348450261657423L;
	private String businessCode;
	private String businessName;
	private String action;
	private String parentCode;
	private List  children;
	
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public List getChildren() {
		return children;
	}
	public void setChildren(List children) {
		this.children = children;
	}

}
