package api.portfolio.springboot.Experiencia.Repository;

import api.portfolio.springboot.Experiencia.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
}

