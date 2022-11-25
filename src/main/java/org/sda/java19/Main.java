package org.sda.java19;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * 3. Personal information
 * a. Create a file containing any personal data (name, surname, phone number). Data of individual persons should be in the following lines.
 * b. Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
 * c. Enter the created objects into ArrayList or Map (<line number>: <Person>).
 * d. Present the obtained data.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Path personsPath = Paths.get("C:\\Users\\Marko\\IdeaProjects\\java-advanced-coding\\src\\main\\resources\\personData.txt");

        //File reading
        List<String> fileLines = Files.readAllLines(personsPath, StandardCharsets.UTF_8);
        List<Person1> person1List = new ArrayList<>();
        List<Person2> person2List = new ArrayList<>();

        for (String fileline: fileLines) {
            String[] person = fileline.split(", ");

            switch(person[0]) {
                case "Person1":
                    Person1 person1 = new Person1();
                    person1.setName(person[2]);
                    person1.setSurname(person[4]);
                    person1.setPhoneNumber(person[6]);
                    person1List.add(person1);
                    break;
                case "Person2":
                    Person2 person2 = new Person2();
                    person2.setName(person[2]);
                    person2.setSurname(person[4]);
                    person2.setPhoneNumber(person[6]);
                    person2List.add(person2);
                    break;
                default:
                    System.out.println("Invalid person!");
            }
        }

        System.out.println(person1List);
        System.out.println(person2List);

        for (Person1 list: person1List) {
            System.out.println(list.);
        }

    }
}
