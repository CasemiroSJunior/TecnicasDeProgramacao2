package model.repository;

import model.ContatoVO;

import java.util.List;

public interface iContatoRepository {
    void salvar(ContatoVO contatoVO);
    void atualizar(ContatoVO contatoVO);
    void excluir(Integer id);
    ContatoVO buscarPorEmail(String email);
    List<ContatoVO> buscarTodos();
}
