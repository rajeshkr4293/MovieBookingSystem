package com.moviebooking.service;

import java.util.List;

import com.moviebooking.database.Database;
import com.moviebooking.model.Show;
import com.moviebooking.model.Booking;

public class BookingService {
	
	//Book Tickets
	public void bookTickets(int bookingId, int userId,int showId, int numberOfTickets) {
		Show show = Database.showMap.get(showId);
		
		if(show == null) {
            System.out.println("❌ Show not found with ID: " + showId);
            return;

		}
		
		double totalAmount =  numberOfTickets * show.getTicketPrice();
		
		Booking booking = new Booking(bookingId, userId, showId, numberOfTickets, totalAmount);
		Database.bookingList.add(booking);
		
        System.out.println("✅ Booking successful: " + booking);

	}
	
	
	
	
	  // View all bookings
    public void displayAllBookings() {
        System.out.println("🧾 All Bookings:");
        List<Booking> bookings = Database.bookingList;

        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }

        for (Booking b : bookings) {
            System.out.println(b);
        }
    }
	

}
