package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class GoodsForm implements Serializable{
	
//	定義
	private int id;
	private String goodsName;
	private int price;
	
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
	
}
