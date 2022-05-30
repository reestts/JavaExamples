package com.reestts.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {

    private Activity activity;

    void executeActivity() {
        activity.doIt();
    }
}
