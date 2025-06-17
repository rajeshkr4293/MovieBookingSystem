package com.moviebooking.database;

import java.util.*;
import com.moviebooking.model.*;

public class Database {
	public static Map<Integer, Movie> movieMap = new HashMap<Integer, Movie>();
	public static Map<Integer, Theatre> theatreMap = new HashMap<Integer, Theatre>();
	public static Map<Integer, Screen> screenMap = new HashMap<Integer, Screen>();
	public static Map<Integer, Show> showMap = new HashMap<Integer, Show>();
	public static Map<Integer, User> userMap = new HashMap<Integer, User>();
	public static List<Booking> bookingList= new ArrayList<Booking>();

}
