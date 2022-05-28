package com.reestts.streamapi.anystreams.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Specialist {

    private String name;
    private BigDecimal salary;
    private Specialty specialty;

    @Override
    public String toString() {
        return "Specialist{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", specialty=" + specialty +
                '}';
    }
}
