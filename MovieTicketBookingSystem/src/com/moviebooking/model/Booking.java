package com.moviebooking.model;

public class Booking {
	private int bookingId;
	private int userId;
	private int showId;
	private int numberOfTickets;
	private double totalAmount;
	
	public Booking(int bookingId, int userId, int showId, int numberOfTickets, double totalAmount) {
		this.bookingId=bookingId;
		this.userId=userId;
		this.showId=showId;
		this.numberOfTickets=numberOfTickets;
		this.totalAmount=totalAmount;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Override
	public String toString() {
		return "[" + bookingId + "] User ID: " + userId + ", Show ID: " + showId + ", Tickets: " + numberOfTickets + ", Total: ₹" + totalAmount;
	}

}
