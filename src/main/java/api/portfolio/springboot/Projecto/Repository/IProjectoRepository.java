
package api.portfolio.springboot.Projecto.Repository;

import api.portfolio.springboot.Projecto.Entity.Projecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectoRepository extends JpaRepository <Projecto, Integer>{
    
}
