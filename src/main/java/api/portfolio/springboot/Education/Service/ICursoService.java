package api.portfolio.springboot.Education.Service;

import api.portfolio.springboot.Education.Entity.Curso;
import java.util.List;


public interface ICursoService {
    public void crearCurso(Curso curso);
    public List<Curso> traerCursos();
    public void eliminarCurso(int id);
    public void editarCurso(int id, String nuevoNombre, String nuevaDescripcion, List<String> nuevaListaLenguajes, String nuevaImg);
}
