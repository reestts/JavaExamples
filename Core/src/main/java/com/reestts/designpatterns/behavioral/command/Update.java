package com.reestts.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Update implements Command {

    Database database;

    @Override
    public void execute() {
        database.update();
    }
}
