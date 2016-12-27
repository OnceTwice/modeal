package com.ff.modeal.vo;

public class UserVo {

	private long no;
	private String id;
	private String password;
	private String gender;
	private String location;
	private String birth;
	private int managerIdentified;
	private long shopNo;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
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
	public int getManagerIdentified() {
		return managerIdentified;
	}
	public void setManagerIdentified(int managerIdentified) {
		this.managerIdentified = managerIdentified;
	}
	public long getShopNo() {
		return shopNo;
	}
	public void setShopNo(long shopNo) {
		this.shopNo = shopNo;
	}
	
	@Override
	public String toString() {
		return "UsersVo [no=" + no + ", id=" + id + ", password=" + password + ", gender=" + gender + ", location="
				+ location + ", birth=" + birth + ", managerIdentified=" + managerIdentified + ", shopNo=" + shopNo
				+ "]";
	}
	
	

}
