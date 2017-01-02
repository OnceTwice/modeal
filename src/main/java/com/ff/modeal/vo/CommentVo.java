package com.ff.modeal.vo;

public class CommentVo {
	
	private Long no;
	private String content;
	private Long rank;
	private Long shopNo;
	private Long usersNo;
	
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
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	public Long getShopNo() {
		return shopNo;
	}
	public void setShopNo(Long shopNo) {
		this.shopNo = shopNo;
	}
	public Long getUsersNo() {
		return usersNo;
	}
	public void setUsersNo(Long usersNo) {
		this.usersNo = usersNo;
	}
	
	@Override
	public String toString() {
		return "CommentVo [no=" + no + ", content=" + content + ", rank=" + rank + ", shopNo=" + shopNo + ", usersNo="
				+ usersNo + "]";
	}
}
