package com.ff.modeal.vo.app;

public class ShopVo {
	private Long no;
	private String address;
	private String newAddress;
	private String name;
	private String phone;
	private String picture;
	private String introduce;
	private Double longitude;
	private Double latitude;
	
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
	public String getNewAddress() {
		return newAddress;
	}
	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
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
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "ShopVo [no=" + no + ", address=" + address + ", newAddress=" + newAddress + ", name=" + name
				+ ", phone=" + phone + ", picture=" + picture + ", introduce=" + introduce + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}
}
