package com.reestts.designpatterns.behavioral.chainofresponsibility;

public class MainChainOfResponsibility {

    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.LOW.getLevel());
        Notifier emailNotifier = new EmailNotifier(Priority.MEDIUM.getLevel());
        Notifier messageNotifier = new MessageNotifier(Priority.HIGH.getLevel());

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(messageNotifier);

        reportNotifier.notifyManager("OK", Priority.LOW.getLevel());
        reportNotifier.notifyManager("NOT OK", Priority.MEDIUM.getLevel());
        reportNotifier.notifyManager("BAD", Priority.HIGH.getLevel());
    }
}
