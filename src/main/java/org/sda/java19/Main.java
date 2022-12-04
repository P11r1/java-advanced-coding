package org.sda.java19;

import org.sda.java19.exception.MaximumNumberOfStudentsReached;
import org.sda.java19.models.Group;
import org.sda.java19.models.Student;
import org.sda.java19.models.Trainer;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 * SDA Scheduler
 * <p>
 * Create a class hierarchy:
 * Person.java - firstname
 * - lastname
 * - dateOfBirth
 * Trainer.java (extends Person) - isAuthorized (boolean)
 * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 * <p>
 * <p>
 * Create a Group class which has
 * <p>
 * name (Java19Remote, Java20Remote, etc)
 * one trainer
 * a list of students
 * <p>
 * <p>
 * <p>
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

        //STORE STUDENTS, TRAINERS, GROUPS IN A LIST
        List<Student> studentList = getInitialStudents();
        List<Trainer> trainerList = getInitialTrainers();
        List<Group> groupList = getInitialGroups();
        assignStudentsToGroup(groupList);
    }

    //MANUALLY INITIALIZE 15 STUDENTS
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

        Student student2 = new Student();
        student2.setFirstName("Martin");
        student2.setLastName("Link");
        student2.setDateOfBirth(LocalDate.of(1965, 12, 7));
        student2.setHasPreviousJavaKnowledge(false);

        Student student3 = new Student();
        student3.setFirstName("Riho");
        student3.setLastName("Tammis");
        student3.setDateOfBirth(LocalDate.of(1990, 9, 1));
        student3.setHasPreviousJavaKnowledge(false);

        Student student4 = new Student();
        student4.setFirstName("Liis");
        student4.setLastName("Poon");
        student4.setDateOfBirth(LocalDate.of(1995, 8, 2));
        student4.setHasPreviousJavaKnowledge(false);

        Student student5 = new Student();
        student5.setFirstName("Ringo");
        student5.setLastName("Leht");
        student5.setDateOfBirth(LocalDate.of(1978, 7, 5));
        student5.setHasPreviousJavaKnowledge(false);

        Student student6 = new Student();
        student6.setFirstName("Katrin");
        student6.setLastName("Turin");
        student6.setDateOfBirth(LocalDate.of(1994, 6, 6));
        student6.setHasPreviousJavaKnowledge(false);

        Student student7 = new Student();
        student7.setFirstName("Karin");
        student7.setLastName("Laas");
        student7.setDateOfBirth(LocalDate.of(1990, 5, 7));
        student7.setHasPreviousJavaKnowledge(false);

        Student student8 = new Student();
        student8.setFirstName("Kaily");
        student8.setLastName("Madis");
        student8.setDateOfBirth(LocalDate.of(1987, 4, 8));
        student8.setHasPreviousJavaKnowledge(false);

        Student student9 = new Student();
        student9.setFirstName("Riin");
        student9.setLastName("Piim");
        student9.setDateOfBirth(LocalDate.of(1991, 3, 14));
        student9.setHasPreviousJavaKnowledge(false);

        Student student10 = new Student();
        student10.setFirstName("Gerda");
        student10.setLastName("Palu");
        student10.setDateOfBirth(LocalDate.of(1999, 2, 21));
        student10.setHasPreviousJavaKnowledge(false);

        Student student11 = new Student();
        student11.setFirstName("Jana");
        student11.setLastName("Madisson");
        student11.setDateOfBirth(LocalDate.of(1963, 1, 22));
        student11.setHasPreviousJavaKnowledge(false);

        Student student12 = new Student();
        student12.setFirstName("Edgar");
        student12.setLastName("Allik");
        student12.setDateOfBirth(LocalDate.of(1966, 11, 19));
        student12.setHasPreviousJavaKnowledge(false);

        Student student13 = new Student();
        student13.setFirstName("Aivo");
        student13.setLastName("Kask");
        student13.setDateOfBirth(LocalDate.of(1981, 12, 12));
        student13.setHasPreviousJavaKnowledge(false);

        Student student14 = new Student();
        student14.setFirstName("Janika");
        student14.setLastName("Kress");
        student14.setDateOfBirth(LocalDate.of(1982, 5, 27));
        student14.setHasPreviousJavaKnowledge(false);


        //Create 13 more, make sure there is no duplicates
        // also trainers and groups the same way
        return List.of(student, student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14);
    }

    //MANUALLY INITIALIZE 3 TRAINERS
    private static List<Trainer> getInitialTrainers() {
        Trainer trainer = new Trainer();
        trainer.setFirstName("Vinod");
        trainer.setLastName("John");
        trainer.setDateOfBirth(LocalDate.of(1954, 5, 14));
        trainer.setAuthorized(true);

        Trainer trainer2 = new Trainer();
        trainer2.setFirstName("Elon");
        trainer2.setLastName("Musk");
        trainer2.setDateOfBirth(LocalDate.of(1972, 6, 11));
        trainer2.setAuthorized(true);

        Trainer trainer3 = new Trainer();
        trainer3.setFirstName("Richard");
        trainer3.setLastName("Branson");
        trainer3.setDateOfBirth(LocalDate.of(1988, 11, 30));
        trainer3.setAuthorized(true);

        return List.of(trainer, trainer2, trainer3);

    }

    //MANUALLY INITIALIZE 4 GROUPS
    //ASSIGN TRAINER TO EACH GROUP
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
        try {
            groupList = getInitialStudents().get()
        } catch (MaximumNumberOfStudentsReached maximumNumberOfStudentsReached) {
            System.out.println(maximumNumberOfStudentsReached.getLocalizedMessage());
        }


    }
}