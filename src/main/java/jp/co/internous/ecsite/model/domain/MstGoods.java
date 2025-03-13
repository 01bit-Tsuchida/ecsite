package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {
	
//	定義
	private int id;
	
	private String goodsName;
	
	private int price;
	
	private Timestamp createdAt;
	
	private Timestamp updatedAt;
	
//	getter&setter
//	--------------------
//	id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	--------------------
//	goodsName
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
//	--------------------
//	price
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
//	--------------------
//	createdAt
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
//	--------------------
//	updatedAt
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}
