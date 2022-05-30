package com.reestts.designpatterns.behavioral.chainofresponsibility;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(final String message) {
        System.out.println("Notify using simple report..." + message);
    }
}
