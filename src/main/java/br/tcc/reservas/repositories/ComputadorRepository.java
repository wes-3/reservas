package br.tcc.reservas.repositories;

import br.tcc.reservas.entities.Computador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ComputadorRepository extends CrudRepository<Computador, Long> {



}
