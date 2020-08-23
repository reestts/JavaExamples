package com.reestts.jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class Main2 {

    private static final String URL = "jdbc:mysql://localhost:3306/?autoReconnect=true&useSSL=false&myjdbc?useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute("INSERT INTO myjdbc.animal (name, description) VALUES ('namname', 'decdesc');");
            statement.executeUpdate("UPDATE animal SET name = 'panda' WHERE id=1;");
            //statement.addBatch("INSERT INTO animal (name, description) VALUES ('one', 'desca');");
            //statement.addBatch("INSERT INTO animal (name, description) VALUES ('two', 'descb');");
            //statement.addBatch("INSERT INTO animal (name, description) VALUES ('three', 'descc');");
            ResultSet resultset = statement.executeQuery("SELECT * FROM myjdbc.animal");

            while (resultset.next()) {
                int id = resultset.getInt(1);
                String login = resultset.getString(2);
                String password = resultset.getString(3);
                System.out.println(id + " " + login + " " + password);
            }

            //statement.executeBatch();

            //statement.clearBatch();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}