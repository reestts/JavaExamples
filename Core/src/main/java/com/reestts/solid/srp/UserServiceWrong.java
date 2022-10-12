package com.reestts.solid.srp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserServiceWrong {

    public void createUser() {
        // Create our user here
    }

    public User findById(Long id) {
        // Return our user
        return new User(id);
    }

    private void sendAppNotification() {
        // Send an app notification
    }

    private void sendEmail() {
        // Send an email
    }
}
