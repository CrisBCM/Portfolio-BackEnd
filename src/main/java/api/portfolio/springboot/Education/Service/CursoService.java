package api.portfolio.springboot.Education.Service;

import api.portfolio.springboot.Education.Entity.Curso;
import api.portfolio.springboot.Education.Repository.ICursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public void crearCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> traerCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public void eliminarCurso(int id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public void editarCurso(int id, String nuevoNombre, String nuevaDescripcion, List<String> nuevaListaLenguajes) {
        Curso curso = cursoRepo.findById(id).orElse(null);
        
        curso.setNombre(nuevoNombre);
        curso.setDescripcion(nuevaDescripcion);
        curso.setLenguajesAprendidos(nuevaListaLenguajes);
        
        cursoRepo.save(curso);
    }
}
