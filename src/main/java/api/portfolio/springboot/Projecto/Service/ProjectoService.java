
package api.portfolio.springboot.Projecto.Service;

import api.portfolio.springboot.Projecto.Entity.Projecto;
import api.portfolio.springboot.Projecto.Repository.IProjectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectoService implements IProjectoService {
    @Autowired
     private IProjectoRepository projectoRepo;

    @Override
    public void crearProjecto(Projecto proj) {
        projectoRepo.save(proj);
    }

    @Override
    public List<Projecto> traerProjectos() {
        return projectoRepo.findAll();
    }

    @Override
    public void eliminarProjecto(int id) {
        projectoRepo.deleteById(id);
    }

    @Override
    public void editarProjecto(int id, String nuevoNombre, String nuevaDescripcion, String nuevaImg, String nuevaUrl) {
        Projecto proj = projectoRepo.findById(id).orElse(null);
        
        proj.setNombre(nuevoNombre);
        proj.setDescripcion(nuevaDescripcion);
        proj.setImg(nuevaImg);
        proj.setUrl(nuevaUrl);
        
        projectoRepo.save(proj);
    }
}
