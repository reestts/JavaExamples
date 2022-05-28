package com.reestts.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        ProgramLogger.getLogger().addLogInfo("First log...");
        ProgramLogger.getLogger().addLogInfo("Second log...");
        ProgramLogger.getLogger().addLogInfo("Third log...");

        ProgramLogger.getLogger().showLog();
    }
}
