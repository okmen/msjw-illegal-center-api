package cn.illegal.bean;

import java.io.Serializable;
import java.util.List;

public class Yydate_sjd  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 185205058889974396L;
	private List<Sditem> sditem ;

	public void setSditem(List<Sditem> sditem){
	this.sditem = sditem;
	}
	public List<Sditem> getSditem(){
	return this.sditem;
	}
}
