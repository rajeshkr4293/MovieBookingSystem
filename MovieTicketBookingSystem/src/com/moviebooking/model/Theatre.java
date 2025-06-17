package com.moviebooking.model;

public class Theatre {
    private int theatreId;
    private String theatreName;
    private String location;

    public Theatre(int theatreId, String theatreName, String location) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.location = location;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "[" + theatreId + "] " + theatreName + " - " + location;
    }
}
