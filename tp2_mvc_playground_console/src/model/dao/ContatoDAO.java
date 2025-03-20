package model.dao;

import model.ContatoVO;
import model.factory.ConnectionFactory;
import model.factory.TipoBanco;

import java.sql.Connection;
import java.sql.Statement;

//Caso queira manter um tipo de banco de dados relacionado, faz sentido manter a classe abstrata, caso queira outra conexão, como NoSQL
// Criar uma nova interface para fazer a conexão.
public abstract class ContatoDAO {
    private final Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public ContatoDAO(Connection connection) {
        this.connection = connection;
    }

    public abstract void salvar(ContatoVO contatoVO);
}

//Exemplo de classe criada para conexão do Mysql (Pode se repetir com MariaDB);
class ContatoMySQLDAO extends ContatoDAO {
    public ContatoMySQLDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void salvar(ContatoVO contato) {
        try {
//            connection.getConnection(tipoBanco);
            String query = """
                    INSERT INTO 
                        contatos (
                            nome,
                            email,
                            telefone
                        ) 
                        VALUES (
                            '%s','%s', '%s'
                        )
                """;

            Statement statement = getConnection().createStatement();

            statement.execute(
                    String.format(
                            query,
                            contato.getName(),
                            contato.getEmail(),
                            contato.getNumber()
                    )
            );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
