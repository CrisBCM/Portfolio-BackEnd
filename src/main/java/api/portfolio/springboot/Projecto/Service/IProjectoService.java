
package api.portfolio.springboot.Projecto.Service;

import api.portfolio.springboot.Projecto.Entity.Projecto;
import java.util.List;


public interface IProjectoService {
    public void crearProjecto(Projecto proj);
    public List<Projecto> traerProjectos();
    public void eliminarProjecto(int id);
    public void editarProjecto(int id, String nuevoNombre, String nuevaDescripcion, String nuevaImg, String nuevaUrl);
}
