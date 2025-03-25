package com.example.university;

import com.example.model.University;
import com.example.controller.UniversityCreator;
import com.example.university.utils.JsonHandler;

public class Main {
    public static void main(String[] args) {
        University university = UniversityCreator.createTypycalUniversity();

        // Збереження в JSON
        JsonHandler.saveToFile(university, "university.json");

        // Завантаження з JSON
        University loadedUniversity = JsonHandler.loadFromFile("university.json");

        if (loadedUniversity != null) {
            System.out.println("Університет успішно завантажено з файлу!");
        } else {
            System.out.println("Помилка при завантаженні університету.");
        }
    }
}
