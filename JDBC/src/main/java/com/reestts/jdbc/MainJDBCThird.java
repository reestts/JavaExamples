package com.reestts.jdbc;

import java.sql.*;

public class MainJDBCThird {

    private static final String URL = "jdbc:mysql://localhost:3306/?autoReconnect=true&useSSL=false&myjdbc?useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    //закомментированные блоки задают значения параметрам таблицы

    //private static final String INSERT_NEW = "INSERT INTO myjdbc.dish VALUES (?,?,?,?,?,?,?)";
    private static final String GET_ALL = "SELECT * from myjdbc.dish";
    private static final String DELETE = "DELETE FROM myjdbc.dish WHERE id=?";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, 2);
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement(GET_ALL);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                float rating = resultSet.getFloat("rating");
                boolean published = resultSet.getBoolean("published");
                Date date = resultSet.getDate("created");
                byte[] icon = resultSet.getBytes("icon");

                System.out.println("id: " + id + " title: " + title + " description: " + description + " rating: " + rating + " published: " + published + " date: " + date + " icon: " + icon.length);
            }

            /*preparedStatement = connection.prepareStatement(INSERT_NEW);

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "title of dish");
            preparedStatement.setString(3, "description of dish");
            preparedStatement.setFloat(4, 0.2f);
            preparedStatement.setBoolean(5, true);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7, new FileInputStream("Mark.png"));

            preparedStatement.execute();*/

        } catch (SQLException /*| FileNotFoundException*/ e) {
            e.printStackTrace();
        }
    }
}
