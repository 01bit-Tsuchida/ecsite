package jp.co.internous.ecsite.model.domain;

public class MstUser {
	
//	定義
	private int id;
	
	private String userName;
	
	private String password;
	
	private String fullName;
	
	private int isAdmin;
	
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
//	userName
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
//	--------------------
//	password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	--------------------
//	fullName
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
//	--------------------
//	isAdmin
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
