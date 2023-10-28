package br.com.sistemacondominial.condominio.Service;

import br.com.sistemacondominial.condominio.Dto.MoradorDto;
import br.com.sistemacondominial.condominio.Model.Apartamento;
import br.com.sistemacondominial.condominio.Model.Morador;
import br.com.sistemacondominial.condominio.Repository.MoradorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoradorService {


    @Autowired
    MoradorRepository repository;

    @Autowired
    private ModelMapper mapper;



    public MoradorDto cadastrarMorador(MoradorDto dto) {

        Morador dtoFromEntity = mapper.map(dto,Morador.class);

        dtoFromEntity.setApartamento(mapper.map(dto.getApartamento(), Apartamento.class));

        repository.save(dtoFromEntity);

        return mapper.map(dtoFromEntity, MoradorDto.class);

    }
}
