package com.reestts.springmvc;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Employee {
    @Size(min = 3, message = "name must be min 3 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> experience;
    private String yearsOfExperience;
    private String carBrand;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "use XXX-XX-XX")
    private String phoneNumber;

    public Employee() {
        experience = new HashMap<>();
        experience.put("Junior", "1 year");
        experience.put("Middle", "2-3 years");
        experience.put("Senior", "4+ years");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                ", yearsOfExperience='" + yearsOfExperience + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
