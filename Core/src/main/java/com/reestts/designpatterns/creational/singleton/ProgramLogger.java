package com.reestts.designpatterns.creational.singleton;

public class ProgramLogger {

    private static ProgramLogger logger;
    private static String LOG_FILE = "This is log file";

    public static ProgramLogger getLogger() {
        return logger == null ? new ProgramLogger() : logger;
    }

    private ProgramLogger() {

    }

    public void addLogInfo(String logInfo) {
        LOG_FILE += logInfo + "\n";
    }

    public void showLog() {
        System.out.println(LOG_FILE);
    }
}

