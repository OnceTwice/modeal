package com.ff.modeal.vo;

public class UserVo {

	private Long no;
	private String id;
	private String password;
	private String gender;
	private String location;
	private String birth;
	private Long manager_Identified;
	private Long shopNo;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Long getManager_Identified() {
		return manager_Identified;
	}
	public void setManager_Identified(Long manager_Identified) {
		this.manager_Identified = manager_Identified;
	}
	public Long getShopNo() {
		return shopNo;
	}
	public void setShopNo(Long shopNo) {
		this.shopNo = shopNo;
	}
	@Override
	public String toString() {
		return "UserVo [no=" + no + ", id=" + id + ", password=" + password + ", gender=" + gender + ", location="
				+ location + ", birth=" + birth + ", manager_Identified=" + manager_Identified + ", shopNo=" + shopNo
				+ ", getNo()=" + getNo() + ", getId()=" + getId() + ", getPassword()=" + getPassword()
				+ ", getGender()=" + getGender() + ", getLocation()=" + getLocation() + ", getBirth()=" + getBirth()
				+ ", getManager_Identified()=" + getManager_Identified() + ", getShopNo()=" + getShopNo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
