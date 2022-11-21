package org.sda.java19;

import lombok.Getter;

@Getter
public class Developer extends Person {

    private boolean hasExperience;

    public Developer(String firstName, String lastName, int age, boolean hasExperience) {
        super(firstName, lastName, age);
        this.hasExperience = hasExperience;
    }

    public void setHasExperience(boolean hasExperience) {
        this.hasExperience = hasExperience;
    }

    public boolean isHasExperience() {
        return hasExperience;
    }

    protected boolean isWorking() {
        return true;
    }

}
