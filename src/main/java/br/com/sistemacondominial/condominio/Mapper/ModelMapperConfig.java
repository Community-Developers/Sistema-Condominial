package br.com.sistemacondominial.condominio.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper();

        // Configurar o ModelMapper para ignorar campos nulos
        modelMapper.getConfiguration().setSkipNullEnabled(true);

        return modelMapper;
    }

}
