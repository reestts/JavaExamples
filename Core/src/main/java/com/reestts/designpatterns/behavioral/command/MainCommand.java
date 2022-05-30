package com.reestts.designpatterns.behavioral.command;

public class MainCommand {

    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new Insert(database),
                new Select(database),
                new Update(database),
                new Remove(database)
        );

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.removeRecord();
    }
}
