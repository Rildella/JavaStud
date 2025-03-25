package com.example.controller;

import com.example.model.*;

public class UniversityCreator {
    public static University createTypicalUniversity() {
        Human rector = new Human("Ivan", "Petrenko", "Mykolayovych", Sex.MALE) {};
        University university = new University("Kyiv National University", rector);

        Human dean = new Human("Olena", "Shevchenko", "Ivanivna", Sex.FEMALE) {};
        Faculty faculty = new Faculty("Faculty of Computer Science", dean);

        Human headOfDepartment = new Human("Serhiy", "Koval", "Andriyovych", Sex.MALE) {};
        Department department = new Department("Software Engineering", headOfDepartment);

        Human groupLeader = new Human("Oleg", "Tkachenko", "Vitaliyovych", Sex.MALE) {};
        Group group = new Group("SE-21", groupLeader);

        group.addStudent(new Student("Alex", "Bondarenko", "Petrovych", Sex.MALE));
        group.addStudent(new Student("Anna", "Zhuk", "Olehivna", Sex.FEMALE));

        department.addGroup(group);
        faculty.addDepartment(department);
        university.addFaculty(faculty);

        return university;
    }
}
