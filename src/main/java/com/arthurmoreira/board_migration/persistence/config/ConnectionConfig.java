package com.arthurmoreira.board_migration.persistence.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.flywaydb.core.Flyway;

public final class ConnectionConfig {

    private static final String URL = "jdbc:mysql://localhost:3306/dio";
    private static final String USER = "root";
    private static final String PASSWORD = "1234567";

    private ConnectionConfig() {
        throw new UnsupportedOperationException("Esta classe não pode ser instanciada.");
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        connection.setAutoCommit(false);
        return connection;
    }

    public static void runMigrations() {
        Flyway flyway = Flyway.configure()
            .dataSource(URL, USER, PASSWORD)
            .load();
        flyway.migrate();
    }
}
