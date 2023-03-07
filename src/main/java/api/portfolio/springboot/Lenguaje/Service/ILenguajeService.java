
package api.portfolio.springboot.Lenguaje.Service;

import api.portfolio.springboot.Lenguaje.Entity.Lenguaje;
import java.util.List;


public interface ILenguajeService {
    public void crearLenguaje(Lenguaje lenguaje);
    public List<Lenguaje> traerListaLenguajes();
    public Lenguaje traerLenguaje(int id);
    public void eliminarLenguaje(int id);
    public void editarLenguaje(int id, String nuevoNombre, String nuevoPorcentaje);
}
