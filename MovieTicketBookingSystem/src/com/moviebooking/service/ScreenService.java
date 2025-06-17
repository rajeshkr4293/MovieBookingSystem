package com.moviebooking.service;

import java.util.Map;

import com.moviebooking.database.Database;
import com.moviebooking.model.Screen;

public class ScreenService {
	
	//Add new Screen
	public void addScreen(Screen screen) {
		Database.screenMap.put(screen.getScreenId(), screen);
        System.out.println("✅ Screen added: " + screen);

	}
	
	//Get screen By ID
	public Screen getScreenById(int screenId) {
		return Database.screenMap.get(screenId);
	}
	
	//Display all screen
	public void displayAllScreens() {
        System.out.println("📺 Available Screens:");
        for(Map.Entry<Integer, Screen> entry: Database.screenMap.entrySet()) {
        	System.out.println(entry.getValue());
        }
        

	}

}
