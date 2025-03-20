package model.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static String URL = "";
    private static final String USER = "root";
    private static String PASSWORD = "";

    public static Connection getConnection(String database) throws SQLException {
        switch(database){
            case "mysql":
                URL = "jdbc:mysql://localhost:3307/fatec";
                PASSWORD = "root";
                return DriverManager.getConnection(URL, USER, PASSWORD);


            case "mariadb":
                URL = "jdbc:mariadb://localhost:3306/fatec";
                PASSWORD = "";
                return DriverManager.getConnection(URL, USER, PASSWORD);
            default:
                throw new Error("Selecione um sgbd");
        }

    }

}
