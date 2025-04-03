package model.services;
import java.util.Objects;
import model.ContatoDTO;
import model.ContatoVO;
import model.repository.iContatoRepository;

public class ContatoService {

    private final iContatoRepository repository;

    public ContatoService(iContatoRepository repository) {
        this.repository = repository;
    }

    public void salvar(ContatoDTO dto) {
        try{//TODO: Validar o dto
            validar(dto);
            //TODO: Converter dto para VO
            var contato = new ContatoVO(
                    null,
                    dto.getNome(),
                    dto.getEmail(),
                    dto.getTelefone()
            );
            repository.salvar(contato);
        }catch (Exception e){
            System.out.println("Falha ao salvar contato. Error:" + e);
        }
    }

    private void validar(ContatoDTO dto) {
        if (Objects.isNull(dto)) {
            throw new IllegalArgumentException("Contato não pode ser nulo");
        }

        if (Objects.isNull(dto.getNome()) || dto.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }

        if (Objects.isNull(dto.getEmail()) || dto.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo");
        }

        if (Objects.isNull(dto.getTelefone()) || dto.getTelefone().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser nulo");
        }
    }
}
