package com.moviebooking.model;

public class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private int durationInMinutes;

    public Movie(int movieId, String movieName, String genre, int durationInMinutes) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.durationInMinutes = durationInMinutes;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "[" + movieId + "] " + movieName + " (" + genre + ", " + durationInMinutes + " mins)";
    }
}




