package model.repository;

import model.ContatoVO;

import java.util.List;

public interface iContatoRepository {
    void salvar(ContatoVO coontato) throws Exception;
    void atualizar(ContatoVO contato) throws Exception;
    void excluir(Integer id) throws Exception;
    ContatoVO buscarPorEmail(String email) throws Exception;
    List<ContatoVO> buscarTodos();
}