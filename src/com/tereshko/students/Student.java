package com.tereshko.students;

public class Student {
    private final String name;
    private final String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
