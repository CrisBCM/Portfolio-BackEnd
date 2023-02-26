package api.portfolio.springboot.Persona.Repository;

import api.portfolio.springboot.Persona.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer>{
    
}
