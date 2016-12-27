package com.ff.modeal.vo;

public class UsersVo {

	Long no;
	String id;
	String password;
	String gender;
	String location;
	String bithday;
	Long managerIdentified;
	Long shopNo;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBithday() {
		return bithday;
	}

	public void setBithday(String bithday) {
		this.bithday = bithday;
	}

	public Long getManagerIdentified() {
		return managerIdentified;
	}

	public void setManagerIdentified(Long managerIdentified) {
		this.managerIdentified = managerIdentified;
	}

	public Long getShopNo() {
		return shopNo;
	}

	public void setShopNo(Long shopNo) {
		this.shopNo = shopNo;
	}

	@Override
	public String toString() {
		return "UsersVo [no=" + no + ", id=" + id + ", password=" + password + ", gender=" + gender + ", location="
				+ location + ", bithday=" + bithday + ", managerIdentified=" + managerIdentified + ", shopNo=" + shopNo
				+ "]";
	}

}
