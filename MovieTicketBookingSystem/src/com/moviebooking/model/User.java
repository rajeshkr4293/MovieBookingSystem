package com.moviebooking.model;

public class User {
	private int userId;
	private String userName;
	private String email;
	private long phoneNumber;
	
	public User(int userId, String userName, String email, long phoneNumber) {
		this.userId=userId;
		this.userName=userName;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
        return "[" + userId + "] " + userName + " | Email: " + email + " | Phone: " + phoneNumber;

	}

}
