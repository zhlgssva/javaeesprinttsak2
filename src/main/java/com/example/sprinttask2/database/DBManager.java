package com.example.sprinttask2.database;

import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlabeesprinttask2?useUnicode=true&serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean addItem(Items item) {
        int rows = 0;
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO items (id,name,description1,description2,description3,price) VALUES (NULL,?,?,?,?,?)");
            statement.setString(1, item.getName());
            statement.setString(2, item.getDescription1());
            statement.setString(3, item.getDescription2());
            statement.setString(4, item.getDescription3());
            statement.setDouble(5, item.getPrice());
            rows = statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }

    public static ArrayList<Items> getItems() {
        ArrayList<Items> items = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT id,name,description1,description2,description3,price FROM items");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                items.add(new Items(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description1"),
                        resultSet.getString("description2"),
                        resultSet.getString("description3"),
                        resultSet.getDouble("price")
                ));
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return items;
    }

    public static ArrayList<Users> getUsers() {
        ArrayList<Users> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT id,email,password,fullName FROM users");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                users.add(new Users(
                        resultSet.getLong("id"),
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getString("fullName")
                ));
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
