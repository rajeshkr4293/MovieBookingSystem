package com.moviebooking.model;

public class Show {
	private int showId;
	private int movieId;
	private int screenId;
	private String showTime;
	private double ticketPrice;
	
	public Show(int showId, int movieId, int screenId, String showTime, double ticketPrice) {
		this.showId=showId;
		this.movieId=movieId;
		this.screenId=screenId;
		this.showTime=showTime;
		this.ticketPrice=ticketPrice;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	@Override
	public String toString() {
		return "[" + showId + "] Movie ID: " + movieId + ", Screen ID: " + screenId + ", Time: " + showTime + ", Price: ₹" + ticketPrice;
	}

}
