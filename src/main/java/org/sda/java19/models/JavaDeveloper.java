package org.sda.java19.models;

import lombok.*;
import org.sda.java19.models.Developer;

/**
 * JavaDeveloper model inherited
 *
 * @author Marko
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class JavaDeveloper extends Developer {

    private int salary;





    //Method overloading: Same method name but different number of parameters
    public void setName(String firstName, String lastName) {
        super.setName(firstName.concat(lastName));
    }
}
