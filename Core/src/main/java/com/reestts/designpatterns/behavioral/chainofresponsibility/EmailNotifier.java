package com.reestts.designpatterns.behavioral.chainofresponsibility;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(final String message) {
        System.out.println("Notify using email..." + message);
    }
}
