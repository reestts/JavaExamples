package com.reestts.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TextChat implements Chat {

    private User admin;
    private List<User> users = new ArrayList<>();

    void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User us : users) {
            if (us != user) {
                us.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
