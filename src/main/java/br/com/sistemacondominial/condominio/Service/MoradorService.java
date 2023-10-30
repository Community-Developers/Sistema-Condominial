package br.com.sistemacondominial.condominio.Service;

import br.com.sistemacondominial.condominio.Dto.MoradorDto;
import br.com.sistemacondominial.condominio.Exceptions.EntidadeNaoEncontradaException;
import br.com.sistemacondominial.condominio.Model.Apartamento;
import br.com.sistemacondominial.condominio.Model.Morador;
import br.com.sistemacondominial.condominio.Repository.MoradorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoradorService {

    @Autowired
    MoradorRepository repository;

    @Autowired
    private ModelMapper mapper;

    public MoradorDto cadastrarMorador(MoradorDto dto) {

        Morador dtoFromEntity = mapper.map(dto, Morador.class);

        dtoFromEntity.setApartamento(mapper.map(dto.getApartamento(), Apartamento.class));

        repository.save(dtoFromEntity);

        return mapper.map(dtoFromEntity, MoradorDto.class);

    }

    public ResponseEntity<MoradorDto> atualizacaoCadastral(Long id, MoradorDto dto) {


        Morador morador  = getConsultaCpf(id);

        mapper.map(dto, morador);

        Apartamento apartamento = morador.getApartamento();

        morador.setApartamento(apartamento);

        repository.save(morador);

        MoradorDto retorno = mapper.map(morador, MoradorDto.class);

        return ResponseEntity.status(HttpStatus.OK).body(retorno);

    }

    public Morador bucarId(Long id) {

        return getConsultaCpf(id);

    }

    public List<Morador> listarMoradores() {

        return repository.findAll();
    }

    public void deletarCadastro(Long id) {

        getConsultaCpf(id);

        repository.deleteById(id);

    }
    public Morador getConsultaCpf(Long id) {

        Optional<Morador> optional = repository.findById(id);

        if (optional.isEmpty()) {
            throw new EntidadeNaoEncontradaException(String.format("ID %d não encontrada ", id));
        }
        return optional.get();
    }

}
