package model.repository;

import java.util.List;
import model.ContatoVO;
import model.dao.ContatoDAO;

public class ContatoMySqlRepositoryImpl implements iContatoRepository {

    private final ContatoDAO dao;

    public ContatoMySqlRepositoryImpl(ContatoDAO dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(ContatoVO contato) {
        this.dao.salvar(contato);
    }

    @Override
    public void atualizar(ContatoVO contato) {
        this.dao.atualizar(contato);
    }

    @Override
    public void excluir(Integer id) {
        this.dao.excluir(id);
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        return this.dao.buscarPorEmail(email);
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return dao.buscarTodos();
    }

}
