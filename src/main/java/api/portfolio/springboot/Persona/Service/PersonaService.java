package api.portfolio.springboot.Persona.Service;

import api.portfolio.springboot.Persona.Entity.Persona;
import api.portfolio.springboot.Persona.Repository.IPersonaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    @Autowired 
    private IPersonaRepository personaRepo;

    @Override
    public void crearPersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void EliminarPersona(int id) {
        personaRepo.deleteById(id);
    }

    @Override
    public void editarPersona(int id, String nuevoNombre, String nuevaEdad, String nuevoTelefono, String nuevoEmail, String nuevaDescripcion, String nuevaImagen) {
        
        Persona personaAEditar = personaRepo.findById(id).orElse(null);
        
        personaAEditar.setNombre(nuevoNombre);
        personaAEditar.setEdad(nuevaEdad);
        personaAEditar.setTelefono(nuevoTelefono);
        personaAEditar.setEmail(nuevoEmail);
        personaAEditar.setDescripcion(nuevaDescripcion);
        personaAEditar.setImg(nuevaImagen);
        
        personaRepo.save(personaAEditar);
        
    }

    @Override
    public Persona traerPersonaPorId(int id) {
        return personaRepo.findById(id).orElse(null);
       
    }

    @Override
    public List<Persona> traerPersonaPorNombre(String nombre) {
           List<Persona> listaPersona = personaRepo.findAll();
           List <Persona> listaPersonaFilt = new ArrayList<>();
           
           for (Persona persona : listaPersona){
               
               if(persona.getNombre().contains(nombre)){
                   listaPersonaFilt.add(persona);
               }
               
           }
           return listaPersonaFilt;
    }
}
