package com.ff.modeal.vo;

public class HelpVo {
	
	private Long no;
	private String title;
	private String complain;
	private String regDate;
	private Long usersNo;
	
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
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Long getUsersNo() {
		return usersNo;
	}
	public void setUsersNo(Long usersNo) {
		this.usersNo = usersNo;
	}
	
	@Override
	public String toString() {
		return "HelpVo [no=" + no + ", title=" + title + ", complain=" + complain + ", regDate=" + regDate + ", usersNo=" + usersNo + "]";
	}
}
