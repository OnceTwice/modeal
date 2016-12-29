package com.ff.modeal.vo;

public class ShopVo {
	private Long no;
	private String address;
	private String name;
	private String phone;
	private String picture;
	private String introduce;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	@Override
	public String toString() {
		return "ShopVo [no=" + no + ", address=" + address + ", name=" + name + ", phone=" + phone + ", picture="
				+ picture + ", introduce=" + introduce + "]";
	}
}
