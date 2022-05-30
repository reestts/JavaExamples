package com.reestts.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Select implements Command {

    Database database;

    @Override
    public void execute() {
        database.select();
    }
}
