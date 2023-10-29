package br.com.sistemacondominial.condominio.Repository;

import br.com.sistemacondominial.condominio.Model.Morador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoradorRepository  extends JpaRepository<Morador,Long> {


}
