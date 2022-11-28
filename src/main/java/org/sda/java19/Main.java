package org.sda.java19;

import org.sda.java19.models.Group;
import org.sda.java19.models.Student;
import org.sda.java19.models.Trainer;

import java.time.LocalDate;

import java.util.List;

/**
 * SDA Scheduler
 *
 * Create a class hierarchy:
 * Person.java - firstname
 *             - lastname
 *             - dateOfBirth
 * Trainer.java (extends Person) - isAuthorized (boolean)
 * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 *
 *
 * Create a Group class which has
 *
 * name (Java19Remote, Java20Remote, etc)
 * one trainer
 * a list of students
 *
 *
 *
 * Manually initialize 15 students; 4 groups and 3 trainers;
 * Store all students in a list; all groups in a list; all trainers in a list;
 * Assign a trainer to each group
 * Assign 2-3 students to each group
 * Ensure the fact that a group will only have distinct students (How would you do that?)
 * Ensure the fact that a group will only have a maximum of 5 students; When you try to add a 6th one throw an MaximumNumberOfStudentsReached exception
 * Display all students in a group sorted alphabetically by lastName
 * Display the group with the maximum number of students
 * Display all students younger than 25, from all groups
 * Display all students grouped by trainer that teaches to them (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10) - regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 * Display all students with previous java knowledge
 * Display the group with the highest number of students with no previous java knowledge
 * Remove all the students younger than 20 from all groups. Display the groups before and after removal.
 *
 * @author Marko
 */

public class Main {
    public static void main(String[] args) {


        List<Student> studentList = getInitialStudents();
        List<Trainer> trainerList = getInitialTrainers();
        List<Group> groupList = getInitialGroups();
        assignStudentsToGroup(groupList);
    }

    private static List<Student> getInitialStudents() {
        Student student = new Student();
        student.setFirstName("Marko");
        student.setLastName("Piir");
        student.setDateOfBirth(LocalDate.of(1992, 10, 15));
        student.setHasPreviousJavaKnowledge(false);

        Student student1 = new Student();
        student1.setFirstName("Katrin");
        student1.setLastName("Turin");
        student1.setDateOfBirth(LocalDate.of(1996, 11, 18));
        student1.setHasPreviousJavaKnowledge(false);

        //Create 13 more, make sure there is no duplicates
        // also trainers and groups the same way
        return List.of(student, student1);
    }

    private static List<Trainer> getInitialTrainers() {
        Trainer trainer = new Trainer();
        trainer.setFirstName("Vinod");
        trainer.setLastName("John");
        trainer.setDateOfBirth(LocalDate.of(1954, 5, 14));
        trainer.setAuthorized(true);
        return List.of(trainer);

    }

    private static List<Group> getInitialGroups() {
        Group group = new Group();
        group.setName("Java19");
        group.setTrainer(getInitialTrainers().get(0));


        Group group2 = new Group();
        group2.setName("Java20");
        group2.setTrainer(getInitialTrainers().get(2));

        Group group3 = new Group();
        group3.setName("Java21");
        group3.setTrainer(getInitialTrainers().get(1));

        Group group4 = new Group();
        group4.setName("Java22");
        group4.setTrainer(getInitialTrainers().get(0));

        return List.of(group, group2, group3, group4);

    }

    private static void assignStudentsToGroup(List<Group> groupList) {
        Group group = new Group();



    }
}