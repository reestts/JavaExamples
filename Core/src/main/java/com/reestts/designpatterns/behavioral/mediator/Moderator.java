package com.reestts.designpatterns.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Moderator implements User {

    private Chat chat;
    private String name;

    @Override
    public void sendMessage(final String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(final String message) {
        System.out.println(this.name + " receiving message: \"" + message + "\"");
    }
}
