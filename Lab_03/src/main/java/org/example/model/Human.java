package com.example.model;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex sex;

    public Human(String firstName, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " (" + sex + ")";
    }
}
