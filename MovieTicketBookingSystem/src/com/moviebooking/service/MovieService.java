package com.moviebooking.service;


import java.util.Map;

import com.moviebooking.database.Database;
import com.moviebooking.model.Movie;

public class MovieService {
	
	// Add a new movie
	public void addMovie(Movie movie) {
		Database.movieMap.put(movie.getMovieId(), movie);
		System.out.println("✅ Movie added: " + movie);
	}
	
	
    // Get movie by ID
	public Movie getMovieById(int movieId) {
		return Database.movieMap.get(movieId);
		
	}
	
    // Display all movies
	public void displayAllMovies() {
        System.out.println("🎬 Available Movies:");
        for(Map.Entry<Integer, Movie> entry : Database.movieMap.entrySet()) {
        	System.out.println(entry.getValue());
        }

	}



}
