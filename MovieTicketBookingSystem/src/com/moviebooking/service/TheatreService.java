package com.moviebooking.service;

import java.util.Map;

import com.moviebooking.database.Database;
import com.moviebooking.model.Theatre;

public class TheatreService {
	
	//Add new Theatre
	public void addTheatre(Theatre theatre) {
		Database.theatreMap.put(theatre.getTheatreId(), theatre);
		System.out.println("✅ Theatre added: " + theatre);
		
	}
	
	//Get theatre by ID
	public Theatre getTheatreById(int theatreId) {
		return Database.theatreMap.get(theatreId);
	}
	
	
	//Display all Theatres
    public void displayAllTheatres() {
        System.out.println("🏛️ Available Theatres:");
        for(Map.Entry<Integer, Theatre> entry: Database.theatreMap.entrySet()) {
        	System.out.println(entry.getValue());
        }

    }

	

}
