package api.portfolio.springboot.Education.Repository;

import api.portfolio.springboot.Education.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer>{
    
}

