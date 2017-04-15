package cn.illegal.bean;

import java.io.Serializable;

public class IllegalProcessPointBean implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8954176986732282252L;

	private String cldaddress;

	private String cldbmid;

	private String cldbmmc;

	private String cldlxdh;

	private String cldtsdh;

	private String pingt_y;

	private String point_x;

	public void setCldaddress(String cldaddress){
	this.cldaddress = cldaddress;
	}
	public String getCldaddress(){
	return this.cldaddress;
	}
	public void setCldbmid(String cldbmid){
	this.cldbmid = cldbmid;
	}
	public String getCldbmid(){
	return this.cldbmid;
	}
	public void setCldbmmc(String cldbmmc){
	this.cldbmmc = cldbmmc;
	}
	public String getCldbmmc(){
	return this.cldbmmc;
	}
	public void setCldlxdh(String cldlxdh){
	this.cldlxdh = cldlxdh;
	}
	public String getCldlxdh(){
	return this.cldlxdh;
	}
	public void setCldtsdh(String cldtsdh){
	this.cldtsdh = cldtsdh;
	}
	public String getCldtsdh(){
	return this.cldtsdh;
	}
	public void setPingt_y(String pingt_y){
	this.pingt_y = pingt_y;
	}
	public String getPingt_y(){
	return this.pingt_y;
	}
	public void setPoint_x(String point_x){
	this.point_x = point_x;
	}
	public String getPoint_x(){
	return this.point_x;
	}
}
