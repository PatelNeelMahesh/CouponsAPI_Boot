package com.coupons.api.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Coupons")
public class Coupon {
	@Id
	String id;
	String from;
	String imgurl;
	String storurl;
	String title;
	String couponcode;
	String offer;
	String line1;
	String line2;
	String line3;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getStorurl() {
		return storurl;
	}
	public void setStorurl(String storurl) {
		this.storurl = storurl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCouponcode() {
		return couponcode;
	}
	public void setCouponcode(String couponcode) {
		this.couponcode = couponcode;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", from=" + from + ", imgurl=" + imgurl + ", storurl=" + storurl + ", title="
				+ title + ", couponcode=" + couponcode + ", offer=" + offer + ", line1=" + line1 + ", line2=" + line2
				+ ", line3=" + line3 + "]";
	}
	
	

	
}


