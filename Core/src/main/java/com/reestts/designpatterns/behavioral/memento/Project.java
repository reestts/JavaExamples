package com.reestts.designpatterns.behavioral.memento;

import java.time.LocalDateTime;

public class Project {

    private String version;
    private LocalDateTime date;

    void setVersionAndDate(String version) {
        this.version = version;
        this.date = LocalDateTime.now();
    }

    Save save() {
        return new Save(version, date);
    }

    void load(Save save) {
        this.version = save.getVersion();
        this.date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
