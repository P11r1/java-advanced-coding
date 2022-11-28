package org.sda.java19.exception;

/**
 * Exception to handle threshold of the students in the group
 *
 * @author Marko
 */
public class MaximumNumberOfStudentsReached extends Exception {
    public MaximumNumberOfStudentsReached (String groupName) {
        super(String.format("Group(name=%s) has reached maximum number of students" + groupName));
    }

}
