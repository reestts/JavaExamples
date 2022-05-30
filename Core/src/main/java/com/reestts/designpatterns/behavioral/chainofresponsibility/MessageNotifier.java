package com.reestts.designpatterns.behavioral.chainofresponsibility;

public class MessageNotifier extends Notifier {

    public MessageNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(final String message) {
        System.out.println("Notify using text message..." + message);
    }
}
