
package api.portfolio.springboot.Security.Repository;

import api.portfolio.springboot.Security.Entity.Rol;
import api.portfolio.springboot.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
