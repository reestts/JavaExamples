package com.reestts.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresApp {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "mysecretpassword";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            // Создаем таблицу
            String createTableQuery = "CREATE TABLE IF NOT EXISTS test_table (id serial primary key, name varchar(255), age integer)";
            statement.executeUpdate(createTableQuery);

            // Вставляем данные
            String insertDataQuery = "INSERT INTO test_table (name, age) VALUES ('John Doe', 30)";
            statement.executeUpdate(insertDataQuery);

            // Запрашиваем данные
            String selectDataQuery = "SELECT * FROM test_table";
            ResultSet resultSet = statement.executeQuery(selectDataQuery);

            // Выводим результаты запроса
            while (resultSet.next()) {
                System.out.printf("ID: %d, Name: %s, Age: %d%n", resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
