package com.reestts.designpatterns.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project implements ProjectElement {

    private ProjectElement[] elements;

    Project() {
        this.elements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : elements) {
            element.beWritten(developer);
        }
    }
}
