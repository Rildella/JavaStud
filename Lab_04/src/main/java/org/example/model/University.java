package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human rector;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        return "University: " + name + ", Rector: " + rector.getFullName() + ", Faculties: " + faculties.size();
    }
}
