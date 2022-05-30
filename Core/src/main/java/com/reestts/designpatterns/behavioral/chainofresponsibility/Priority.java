package com.reestts.designpatterns.behavioral.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Priority {

    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int level;

}
