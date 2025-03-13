package model;

import java.util.List;

public interface iContatoRepository {
    void salvar(Contato contato);
    void atualizar(Contato contato);
    void excluir(Integer id);
    Contato buscarPorEmail(String email);
    List<Contato> buscarTodos();
}
