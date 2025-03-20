package model.dao;

import model.ContatoVO;
import model.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.Statement;

public class ContatoDAO {

    public void salvar(ContatoVO contato) {
        try {
            Connection connection = ConnectionFactory.getConnection("mysql");
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

            Statement statement = connection.createStatement();

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
