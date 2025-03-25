package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {
    private static final String URL = "jdbc:sqlite:university.db"; // SQLite база

    public static void createTables() {
        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "name TEXT, " +
                    "surname TEXT, " +
                    "sex TEXT)";

            statement.execute(sql);
            System.out.println("Таблиці створено!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

