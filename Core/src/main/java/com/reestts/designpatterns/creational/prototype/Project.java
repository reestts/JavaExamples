package com.reestts.designpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Copyable {

    private int id;

    private String name;

    private String source;

    @Override
    public Object copy() {
        return new Project(id, name, source);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
