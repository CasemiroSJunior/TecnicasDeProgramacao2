import model.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) throws Exception {
        /*Connection connectionMysql = ConnectionFactory.getConnection("mysql");
        Connection connectionMariaDb = ConnectionFactory.getConnection("mariadb");
        System.out.println(connectionMysql);
        System.out.println(connectionMariaDb);

        ResultSet rstMySQL = connectionMysql.createStatement().executeQuery("select version() as versao;");
        ResultSet rstMariaDb = connectionMariaDb.createStatement().executeQuery("select version() as versao;");

        if (rstMariaDb.next()){
            System.out.println(rstMariaDb.getString("versao"));
        }
        if (rstMySQL.next()){
            System.out.println(rstMySQL.getString("versao"));
        }*/

    }
}