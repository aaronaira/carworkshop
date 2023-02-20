package carworkshop.controllers.database;

import io.github.cdimascio.dotenv.Dotenv;


import java.sql.*;

public class Connection {

    Statement st;
    public Connection() throws SQLException {
        Dotenv dotenv = Dotenv.configure().load();
        java.sql.Connection conn = DriverManager.getConnection(dotenv.get("DB_URL") + dotenv.get("DB_NAME"), dotenv.get("DB_USER"), dotenv.get("DB_PASSWORD"));
        this.st = conn.createStatement();
    }

    public Statement getStatement() {
        return this.st;
    }

}
