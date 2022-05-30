package com.reestts.designpatterns.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {

    private Activity activity;

    void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Training());
        } else {
            if (activity instanceof Training) {
                setActivity(new Coding());
            } else {
                if (activity instanceof Coding) {
                    setActivity(new Reading());
                } else {
                    if (activity instanceof Reading) {
                        setActivity(new Sleeping());
                    }
                }
            }
        }
    }

    void doIt() {
        activity.doIt();
    }
}
