package com.moviebooking.service;

import java.util.Map;
import com.moviebooking.database.Database;
import com.moviebooking.model.Show;

public class ShowService {
    
    // Add new Show
    public void addShow(Show show) {
        Database.showMap.put(show.getShowId(), show);
        System.out.println("✅ Show added: " + show);
    }
    
    // Get Show By ID
    public Show getShowById(int showId) {  // Fix method name capitalization
        return Database.showMap.get(showId);
    }
    
    // Display All Shows
    public void displayAllShows() {  // Fix method name capitalization
        System.out.println("🎥 Available Shows:");
        for(Map.Entry<Integer, Show> entry : Database.showMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
