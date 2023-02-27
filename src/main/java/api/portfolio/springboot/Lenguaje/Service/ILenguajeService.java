
package api.portfolio.springboot.Lenguaje.Service;

import api.portfolio.springboot.Lenguaje.Entity.Lenguaje;


public interface ILenguajeService {
    public void crearLenguaje(Lenguaje lenguaje);
    public Lenguaje traerLenguaje(int id);
    public void eliminarLenguaje(int id);
    public void editarLenguaje(int id, String nuevoNombre, String nuevoPorcentaje);
}
