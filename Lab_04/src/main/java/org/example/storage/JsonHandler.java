package org.example.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.University;
import java.io.File;
import java.io.IOException;

public class JsonHandler {
    private static final String FILE_PATH = "data/university.json";

    public static void saveToJson(University university) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(FILE_PATH), university);
            System.out.println("Дані успішно збережені у JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readFromJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(FILE_PATH), University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
