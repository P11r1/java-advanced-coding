package org.sda.java19.models;

/**
 * Person base class
 *
 * @author Marko
 */

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}
