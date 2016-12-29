package com.ff.modeal.vo;

public class HelpVo {
	
	private Long no;
	private String title;
	private String complain;
	private Long userNo;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComplain() {
		return complain;
	}
	public void setComplain(String complain) {
		this.complain = complain;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	
	@Override
	public String toString() {
		return "HelpVo [no=" + no + ", title=" + title + ", complain=" + complain + ", userNo=" + userNo + "]";
	}
	
}
