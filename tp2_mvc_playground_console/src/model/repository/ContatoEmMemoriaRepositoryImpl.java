package model.repository;

import model.ContatoVO;

import java.util.List;

public class ContatoEmMemoriaRepositoryImpl implements iContatoRepository{

    private List<ContatoVO> contatoVOS;

    @Override
    public void salvar(ContatoVO contatoVO) {
        this.contatoVOS.add(contatoVO);
    }

    @Override
    public void atualizar(ContatoVO contatoVO) {

    }

    @Override
    public void excluir(Integer id) {
        this.contatoVOS.stream().filter(
                c -> c.getId().equals(id)
        ).findFirst().ifPresent(
                        c -> this.contatoVOS.remove(c)
                );
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        return this.contatoVOS.stream().filter(
                c -> c.getEmail().equals(email)
        ).findFirst().orElse(null);
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return this.contatoVOS;
    }
}
