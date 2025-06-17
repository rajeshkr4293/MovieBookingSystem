package com.moviebooking.main;

import java.util.Scanner;

import com.moviebooking.model.*;
import com.moviebooking.service.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize services
        MovieService movieService = new MovieService();
        TheatreService theatreService = new TheatreService();
        ScreenService screenService = new ScreenService();
        ShowService showService = new ShowService();
        UserService userService = new UserService();
        BookingService bookingService = new BookingService();

        while (true) {
            System.out.println("\n🎬 Welcome to Movie Ticket Booking System 🎟️");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Add Theatre");
            System.out.println("4. View Theatres");
            System.out.println("5. Add Screen");
            System.out.println("6. View Screens");
            System.out.println("7. Add Show");
            System.out.println("8. View Shows");
            System.out.println("9. Register User");
            System.out.println("10. View Users");
            System.out.println("11. Book Ticket");
            System.out.println("12. View Bookings");
            System.out.println("0. Exit");
            System.out.print("👉 Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Movie ID: ");
                    int movieId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movieName = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Duration (in mins): ");
                    int duration = scanner.nextInt();
                    movieService.addMovie(new Movie(movieId, movieName, genre, duration));
                    break;

                case 2:
                    movieService.displayAllMovies();
                    break;

                case 3:
                    System.out.print("Enter Theatre ID: ");
                    int theatreId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Theatre Name: ");
                    String theatreName = scanner.nextLine();
                    System.out.print("Enter Location: ");
                    String location = scanner.nextLine();
                    theatreService.addTheatre(new Theatre(theatreId, theatreName, location));
                    break;

                case 4:
                    theatreService.displayAllTheatres();
                    break;

                case 5:
                    System.out.print("Enter Screen ID: ");
                    int screenId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Screen Name: ");
                    String screenName = scanner.nextLine();
                    System.out.print("Enter Theatre ID for the Screen: ");
                    int screenTheatreId = scanner.nextInt();
                    System.out.print("Enter Total Seats: ");
                    int totalSeats = scanner.nextInt();
                    screenService.addScreen(new Screen(screenId, screenName, screenTheatreId, totalSeats));
                    break;

                case 6:
                    screenService.displayAllScreens();
                    break;

                case 7:
                    System.out.print("Enter Show ID: ");
                    int showId = scanner.nextInt();
                    System.out.print("Enter Movie ID: ");
                    int showMovieId = scanner.nextInt();
                    System.out.print("Enter Screen ID: ");
                    int showScreenId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Show Time: ");
                    String showTime = scanner.nextLine();
                    System.out.print("Enter Ticket Price: ");
                    double ticketPrice = scanner.nextDouble();
                    showService.addShow(new Show(showId, showMovieId, showScreenId, showTime, ticketPrice));
                    break;

                case 8:
                    showService.displayAllShows();
                    break;

                case 9:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter User Name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    long phone = scanner.nextLong();
                    userService.addUser(new User(userId, userName, email, phone));
                    break;

                case 10:
                    userService.displayAllUsers();
                    break;

                case 11:
                    System.out.print("Enter Booking ID: ");
                    int bookingId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int bookUserId = scanner.nextInt();
                    System.out.print("Enter Show ID: ");
                    int bookShowId = scanner.nextInt();
                    System.out.print("Enter Number of Tickets: ");
                    int numTickets = scanner.nextInt();
                    bookingService.bookTickets(bookingId, bookUserId, bookShowId, numTickets);
                    break;

                case 12:
                    bookingService.displayAllBookings();
                    break;

                case 0:
                    System.out.println("👋 Thank you for using the Movie Booking System!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
        }
    }
}
