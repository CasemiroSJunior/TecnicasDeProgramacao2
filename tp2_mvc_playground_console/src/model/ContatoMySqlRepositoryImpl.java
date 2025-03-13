package model;

import java.util.List;

public class ContatoMySqlRepositoryImpl implements iContatoRepository{

    @Override
    public void salvar(Contato contato) {

    }

    @Override
    public void atualizar(Contato contato) {

    }

    @Override
    public void excluir(Integer id) {

    }

    @Override
    public Contato buscarPorEmail(String email) {
        return null;
    }

    @Override
    public List<Contato> buscarTodos() {
        return List.of();
    }
}
