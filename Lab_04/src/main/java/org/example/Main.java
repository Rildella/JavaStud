package com.example;

import com.example.controller.UniversityCreator;
import com.example.model.University;

public class Main {
    public static void main(String[] args) {
        University university = UniversityCreator.createTypicalUniversity();
        System.out.println(university);
    }
}
