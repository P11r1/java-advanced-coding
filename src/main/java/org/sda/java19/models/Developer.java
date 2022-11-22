package org.sda.java19.models;

import lombok.*;

/**
 * Developer model inherited
 *
 * @author Marko
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Developer extends Person {

    private boolean hasExperience;


}
