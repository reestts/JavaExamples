package com.reestts.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Developer {

    Command insert;
    Command select;
    Command update;
    Command remove;

    void insertRecord() {
        insert.execute();
    }

    void selectRecord() {
        select.execute();
    }

    void updateRecord() {
        update.execute();
    }

    void removeRecord() {
        remove.execute();
    }
}
