package com.moviebooking.service;

import java.util.Map;
import com.moviebooking.database.Database;
import com.moviebooking.model.User;

public class UserService {

    // Add a new user
    public void addUser(User user) {
        Database.userMap.put(user.getUserId(), user);
        System.out.println("✅ User added: " + user);
    }
    
    // Get user by ID
    public User getUserById(int userId) {
        return Database.userMap.get(userId);
    }
    
    // Display all users
    public void displayAllUsers() {
        System.out.println("👤 Registered Users:");
        for (Map.Entry<Integer, User> entry : Database.userMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
