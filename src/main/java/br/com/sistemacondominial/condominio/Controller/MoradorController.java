package br.com.sistemacondominial.condominio.Controller;

import br.com.sistemacondominial.condominio.Dto.MoradorDto;
import br.com.sistemacondominial.condominio.Service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moradores")
public class MoradorController {

    @Autowired
    MoradorService service;

    @PostMapping("/Cadastrar")
    public ResponseEntity<MoradorDto> Cadastrar(@RequestBody MoradorDto dto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarMorador(dto));

    }


}
