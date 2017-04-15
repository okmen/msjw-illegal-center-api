package cn.illegal.bean;

import java.io.Serializable;

public class ReservationDay  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3397203762097686564L;

	private String yydate;

	private Yydate_sjd yydate_sjd;

	private String yydate_xq;

	public void setYydate(String yydate){
	this.yydate = yydate;
	}
	public String getYydate(){
	return this.yydate;
	}
	public void setYydate_sjd(Yydate_sjd yydate_sjd){
	this.yydate_sjd = yydate_sjd;
	}
	public Yydate_sjd getYydate_sjd(){
	return this.yydate_sjd;
	}
	public void setYydate_xq(String yydate_xq){
	this.yydate_xq = yydate_xq;
	}
	public String getYydate_xq(){
	return this.yydate_xq;
	}

}
