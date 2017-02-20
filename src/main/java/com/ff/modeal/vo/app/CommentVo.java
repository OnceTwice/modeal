package com.ff.modeal.vo.app;

public class CommentVo {
	private Long no;
	private String content;
	private Long grade;
	private Long shopNo;
	private Long userNo;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getGrade() {
		return grade;
	}
	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getShopNo() {
		return shopNo;
	}
	public void setShopNo(Long shopNo) {
		this.shopNo = shopNo;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	
	@Override
	public String toString() {
		return "CommentVo [no=" + no + ", content=" + content + ", grade=" + grade + ", shopNo=" + shopNo + ", userNo=" + userNo + "]";
	}
}
