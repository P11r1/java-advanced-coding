package org.sda.java19;

import lombok.*;

@Getter
@Setter
@ToString

public class JavaDeveloper extends Developer{

    private int salary;



    public JavaDeveloper(String firstName, String lastName, int age, boolean hasExperience, int salary) {
        super(firstName, lastName, age, hasExperience);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
