package org.sda.java19;

import org.sda.java19.models.JavaDeveloper;

/**
 * Exercise 1
 *
 * Create 3 classes: Person, Developer, JavaDeveloper.
 * a. Person is a parent class, Developer inherits from Person, JavaDeveloper inherits from
 * Developer
 * b. Create constructor for every class that will call constructor of the super class. Each
 * constructor should display an information, that it has been called.
 * c. Create an object of type JavaDeveloper. What information will be displayed and in
 * what order?
 * d. Using an object of type JavaDeveloper call a method that is defined in Developer
 * class. What access modifier should it have?
 * e. *Overload method from the Person class in JavaDeveloper class to accept additional
 * parameters.
 *
 * @author Marko
 */

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper1 = new JavaDeveloper();
        javaDeveloper1.setName("Marko");
        javaDeveloper1.setFirstName("Konn");
        javaDeveloper1.setLastName("Karn");
        javaDeveloper1.setAge(30);
        javaDeveloper1.setHasExperience(false);
        javaDeveloper1.setSalary(5000);

        //C.
        System.out.println(javaDeveloper1);

        //D.
        //Public or protected
        System.out.println(javaDeveloper1.getSalary());

        //E.
        javaDeveloper1.setName("Tony ", "Stark");
        System.out.println(javaDeveloper1.getName());


    }
}