package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Human head;
    private List<Student> students = new ArrayList<>();

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group: " + name + ", Head: " + head.getFullName() + ", Students: " + students.size();
    }
}
