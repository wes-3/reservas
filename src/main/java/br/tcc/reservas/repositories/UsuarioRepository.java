package br.tcc.reservas.repositories;

import br.tcc.reservas.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT c FROM Usuario c WHERE c.email like :email")
    public List<Usuario> findByEmail(@Param("email") String email);

}
