package com.ff.modeal.vo;

public class ItemVo {
	private long no;
	private String name;
	private long count;
	private long oriPrice;
	private long price;
	private long discount;
	private String expDate;
	private String picture;
	private long shopNo;
	private long itemCategoryNo;

	@Override
	public String toString() {
		return "ItemVo [no=" + no + ", " + "name=" + name + ", count=" + count + ", oriPrice=" + oriPrice + ", price="
				+ price + ", discount=" + discount + ", expDate=" + expDate + ", picture=" + picture + ", shopNo="
				+ shopNo + ", itemCategoryNo=" + itemCategoryNo + "]";
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getOriPrice() {
		return oriPrice;
	}

	public void setOriPrice(long oriPrice) {
		this.oriPrice = oriPrice;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getDiscount() {
		return discount;
	}

	public void setDiscount(long discount) {
		this.discount = discount;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public long getShopNo() {
		return shopNo;
	}

	public void setShopNo(long shopNo) {
		this.shopNo = shopNo;
	}

	public long getItemCategoryNo() {
		return itemCategoryNo;
	}

	public void setItemCategoryNo(long itemCategoryNo) {
		this.itemCategoryNo = itemCategoryNo;
	}

}
