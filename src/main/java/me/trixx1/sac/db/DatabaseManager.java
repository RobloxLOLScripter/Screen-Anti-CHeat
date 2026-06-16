package me.trixx1.sac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private Connection connection;

    public void connect(String type, String host, int port, String database, String username, String password) throws SQLException {
        if (type.equalsIgnoreCase("sqlite")) {
            connection = DriverManager.getConnection("jdbc:sqlite:plugins/ScreenAntiCheat/data/sac.db");
        } else {
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            connection = DriverManager.getConnection(url, username, password);
        }
        setupTables();
    }

    private void setupTables() throws SQLException {
        try (java.sql.Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS violations (uuid VARCHAR(36), check_name TEXT, count INT, PRIMARY KEY(uuid, check_name))");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
