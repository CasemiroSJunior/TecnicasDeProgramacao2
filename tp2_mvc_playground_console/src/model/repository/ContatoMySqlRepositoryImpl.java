package model.repository;

import model.ContatoVO;

import java.util.List;

public class ContatoMySqlRepositoryImpl implements iContatoRepository{

    @Override
    public void salvar(ContatoVO contatoVO) {

    }

    @Override
    public void atualizar(ContatoVO contatoVO) {

    }

    @Override
    public void excluir(Integer id) {

    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        return null;
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return List.of();
    }
}
