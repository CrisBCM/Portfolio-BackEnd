package api.portfolio.springboot.Experiencia.Controller;

import api.portfolio.springboot.Experiencia.Entity.Experiencia;
import api.portfolio.springboot.Experiencia.Service.IExperienciaService;
import api.portfolio.springboot.Lenguaje.Entity.Lenguaje;
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
public class ExperienciaController {
    @Autowired
    private IExperienciaService iExpService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear/experiencia")
    public String crearExperiencia(@RequestBody Experiencia exp){
        iExpService.crearExperiencia(exp);
        return "Experiencia creada correctamente";
    }
    
    @GetMapping("/traer/experiencias")
    public List<Experiencia> traerListaExperiencia(){
        return iExpService.traerListaExperiencia();
    }
    
    @DeleteMapping("/eliminar/experiencia/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        iExpService.eliminarExperiencia(id);
        return "Experiencia eliminado correctamente!";
    }
    
    @PutMapping("/editar/experiencia/{id}")
    public String editarExperiencia(@PathVariable int id,
                                 @RequestParam ("puesto") String nuevoPuesto,
                                 @RequestParam ("compania") String nuevaCompania,
                                 @RequestParam ("fechaInicio") String nuevaFechaInicio,
                                 @RequestParam ("fechaFinal") String nuevaFechaFinal){
        iExpService.editarExperiencia(id, nuevoPuesto, nuevaCompania, nuevaFechaInicio, nuevaFechaFinal);
        
        return "Lenguaje editado correctamente!";
    }
}
