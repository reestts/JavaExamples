package com.reestts.solid.srp;

import lombok.AllArgsConstructor;

/**
 * Single Responsibility Principle (SRP)
 * A class should have only one responsibility.
 * Methods for work with notifications should be moved to another service - {@link NotificationService}
 */
@AllArgsConstructor
public class UserService {

    private final NotificationService notificationService;

    public void createUser() {
        // Create our user here
    }

    public User findById(Long id) {
        // Return our user
        return new User(id);
    }
}
