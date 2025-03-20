import model.dao.ContatoDAO;
import model.factory.ConnectionFactory;
import model.factory.TipoBanco;

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

        String databaseType = args[0];

        TipoBanco tipo = TipoBanco.getTipo(databaseType);
        ConnectionFactory.getConnection(tipo);

        ContatoDAO dao = new ContatoDAO(ConnectionFactory.getConnection(tipo));


    }
}