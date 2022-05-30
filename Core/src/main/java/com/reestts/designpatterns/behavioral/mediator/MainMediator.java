package com.reestts.designpatterns.behavioral.mediator;

public class MainMediator {

    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Admin");
        User firstModerator = new Moderator(chat, "Moderator 1");
        User secondModerator = new Moderator(chat, "Moderator 2");

        chat.setAdmin(admin);
        chat.addUserToChat(firstModerator);
        chat.addUserToChat(secondModerator);

        firstModerator.sendMessage("Message from first moderator");
    }
}
