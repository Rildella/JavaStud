package org.example.controller;

import com.example.model.University;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniversityCreator {
    private static final Logger logger = LoggerFactory.getLogger(UniversityCreator.class);

    public static University createTypycalUniversity() {
        logger.info("Створюємо типовий університет...");
        University university = new University("Національний університет");

        // Тут логіка додавання факультетів, кафедр, студентів
        logger.info("Університет створено: " + university.getName());

        return university;
    }
}
