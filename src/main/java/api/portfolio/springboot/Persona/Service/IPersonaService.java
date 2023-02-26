
package api.portfolio.springboot.Persona.Service;

import api.portfolio.springboot.Persona.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    public void crearPersona(Persona persona);
    public Persona traerPersonaPorId(int id);
    public List<Persona> traerPersonaPorNombre(String nombre);
    public void EliminarPersona(int id);
    public void editarPersona(int id, String nuevoNombre, String nuevaEdad, String nuevoTelefono, String nuevoEmail, String nuevaDescripcion, String nuevaImagen);
    
}
