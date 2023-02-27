package api.portfolio.springboot.Persona.Controller;

import api.portfolio.springboot.Persona.Entity.Persona;
import api.portfolio.springboot.Persona.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    
    @PostMapping("/crear/persona")
    public String crearPersona(@RequestBody Persona pers){
        personaService.crearPersona(pers);
        
        return "Persona creada correctamente!";
    }
    
    @GetMapping("/obtener/personanombre/{nombre}")
    public List<Persona> obtenerPersonaPorNombre(@PathVariable String nombre){
       return personaService.traerPersonaPorNombre(nombre);
    }
    
    @GetMapping("/obtener/personaid/{id}")
    public Persona obtenerPersonaPorId(@PathVariable int id){
       return personaService.traerPersonaPorId(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/persona/{id}")
    public String eliminarPersona(@PathVariable int id){
        personaService.EliminarPersona(id);
        
        return "Persona eliminada correctamente!";
    }
   
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/persona/{id}")
    public String editarPersona(@PathVariable int id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("edad") String nuevaEdad,
                                @RequestParam ("telefono") String nuevoTelefono,
                                @RequestParam ("email") String nuevoEmail,
                                @RequestParam ("descripcion") String nuevaDescripcion,
                                @RequestParam ("imagen") String nuevaImagen){
        
        personaService.editarPersona(id, nuevoNombre, nuevaEdad, nuevoTelefono, nuevoEmail, nuevaDescripcion, nuevaImagen);
        
        return "Persona editada correctamente!";
    }
}
