package com.reestts.designpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectFactory {

    Project project;

    Project copyProject() {
        return (Project) project.copy();
    }
}
