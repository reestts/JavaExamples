package com.reestts.designpatterns.behavioral.memento;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Save {

    private final String version;
    private final LocalDateTime date;

    Save(String version, LocalDateTime date) {
        this.version = version;
        this.date = date;
    }
}
