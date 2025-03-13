package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {
	
//	定義
	private int id;
	
	private int userId;
	
	private int goodsId;
	
	private String goodsName;
	
	private int itemCount;
	
	private int total;
	
	private Timestamp createdAt;
	
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
//	userId
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
//	--------------------
//	goodsId
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
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
//	itemCount
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
//	--------------------
//	totel
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
//	createdAt
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}
