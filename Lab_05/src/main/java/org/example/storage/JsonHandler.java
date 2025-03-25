package com.example.university.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.model.University;

import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonHandler {
    private static final Logger logger = LoggerFactory.getLogger(JsonHandler.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void saveToFile(University university, String fileName) {
        try {
            objectMapper.writeValue(new File(fileName), university);
            logger.info("Дані університету збережені у файл: " + fileName);
        } catch (IOException e) {
            logger.error("Помилка при збереженні у файл", e);
        }
    }

    public static University loadFromFile(String fileName) {
        try {
            return objectMapper.readValue(new File(fileName), University.class);
        } catch (IOException e) {
            logger.error("Помилка при завантаженні з файлу", e);
            return null;
        }
    }
}
