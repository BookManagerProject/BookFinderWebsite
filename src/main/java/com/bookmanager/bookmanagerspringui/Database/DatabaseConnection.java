package com.bookmanager.bookmanagerspringui.Database;

import com.bookmanager.bookmanagerspringui.Costant.DefaultConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class DatabaseConnection {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);


    private Connection connection;

    public DatabaseConnection() throws SQLException {
        logger.info("Connecting to database...");
        connection = DriverManager.getConnection(DefaultConfig.JBDCCONNECTION);
        logger.info("Connected to database successfully.");
    }

    public void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
            logger.info("Disconnected from database.");
        }
    }

    public ResultSet executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        logger.info("Executing query: {}", query);
        ResultSet resultSet = statement.executeQuery(query);
        logger.info("Query executed successfully.");
        return resultSet;
    }

    public int executeUpdate(String query) throws SQLException {
        Statement statement = connection.createStatement();
        logger.info("Executing update: {}", query);
        int rowCount = statement.executeUpdate(query);
        logger.info("Update executed successfully. Rows affected: {}", rowCount);
        return rowCount;
    }
}
