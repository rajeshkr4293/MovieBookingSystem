package com.moviebooking.model;

public class Screen {
	private int screenId;
	private String screenName;
	private int theatreId;
	private int totalSeats;
	
	public Screen(int screenId, String screenName, int theatreId, int totalSeats) {
		this.screenId=screenId;
		this.screenName=screenName;
		this.theatreId=theatreId;
		this.totalSeats=totalSeats;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	@Override
	public String toString() {
		return "[" + screenId + "] " + screenName + " (Theatre ID: " + theatreId + ", Seats: " + totalSeats + ")"; 
	}
	

}
