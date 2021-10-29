package com.qna.dto;

import java.util.Date;


public class QnaDto {
	private int uskno;
	private int usedno;
	private String usktype;
	private int uskgpno;	
	private int uskgpsq;
	private String userid;
	private String usktitle;
	private String uskcontent;
	private Date uskreg;
	private String uskstatus;
	private String uskpic;
		
	public QnaDto() {
		super();
	}
		
	public QnaDto(int uskno, int usedno, String usktype, int uskgpno, int uskgpsq, String userid, String usktitle,
			String uskcontent, Date uskreg, String uskstatus, String uskpic) {
		super();
		this.uskno = uskno;
		this.usedno = usedno;
		this.usktype = usktype;
		this.uskgpno = uskgpno;
		this.uskgpsq = uskgpsq;
		this.userid = userid;
		this.usktitle = usktitle;
		this.uskcontent = uskcontent;
		this.uskreg = uskreg;
		this.uskstatus = uskstatus;
		this.uskpic = uskpic;
	}
		
	public int getUskno() {
		return uskno;
	}
	public void setUskno(int uskno) {
		this.uskno = uskno;
	}
	public int getUsedno() {
		return usedno;
	}
	public void setUsedno(int usedno) {
		this.usedno = usedno;
	}
	public String getUsktype() {
		return usktype;
	}
	public void setUsktype(String usktype) {
		this.usktype = usktype;
	}
	public int getUskgpno() {
		return uskgpno;
	}
	public void setUskgpno(int uskgpno) {
		this.uskgpno = uskgpno;
	}
	public int getUskgpsq() {
		return uskgpsq;
	}
	public void setUskgpsq(int uskgpsq) {
		this.uskgpsq = uskgpsq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsktitle() {
		return usktitle;
	}
	public void setUsktitle(String usktitle) {
		this.usktitle = usktitle;
	}
	public String getUskcontent() {
		return uskcontent;	
	}
	public void setUskcontent(String uskcontent) {
		this.uskcontent = uskcontent;
	}
	public Date getUskreg() {
		return uskreg;
	}
	public void setUskreg(Date uskreg) {
		this.uskreg = uskreg;
	}
	public String getUskstatus() {
		return uskstatus;
	}
	public void setUskstatus(String uskstatus) {
		this.uskstatus = uskstatus;
	}
	public String getUskpic() {
		return uskpic;
	}
	public void setUskpic(String uskpic) {
		this.uskpic = uskpic;
	}
}