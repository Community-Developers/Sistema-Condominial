package br.com.sistemacondominial.condominio.Controller;

import br.com.sistemacondominial.condominio.Dto.MoradorDto;
import br.com.sistemacondominial.condominio.Exceptions.NotFoundException;
import br.com.sistemacondominial.condominio.Model.Morador;
import br.com.sistemacondominial.condominio.Service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moradores")
public class MoradorController {

    @Autowired
    MoradorService service;

    @PostMapping()
    public ResponseEntity<MoradorDto> cadastrar(@RequestBody MoradorDto dto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarMorador(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Morador> burcarId(@PathVariable Long id) {

        Morador morador = service.bucarId(id);

        try {
            return ResponseEntity.ok().body(morador);

        } catch (NotFoundException e) {

            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping()
    public ResponseEntity<List<Morador>> listarMoradores() {

        List<Morador> moradores = service.listarMoradores();

        return ResponseEntity.ok().body(moradores);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Morador> deletarCadastro(@PathVariable Long id){

        try {
            service.deletarCadastro(id);
            return ResponseEntity.noContent().build();

        }catch (NotFoundException e){

            return ResponseEntity.notFound().build();
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<MoradorDto> atualizarCadastro(@PathVariable Long id,@RequestBody MoradorDto dto){

        return  service.atualizacaoCadastral(id, dto);
    }

}
