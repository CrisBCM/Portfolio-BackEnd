package api.portfolio.springboot.Lenguaje.Controller;

import api.portfolio.springboot.Lenguaje.Entity.Lenguaje;
import api.portfolio.springboot.Lenguaje.Service.ILenguajeService;
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
public class LenguajeController {
    @Autowired
    private ILenguajeService iLengService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear/lenguaje")
    public String crearLenguaje(@RequestBody Lenguaje leng){
        iLengService.crearLenguaje(leng);
        return "Lenguaje creado correctamente";
    }
    
    @GetMapping("/traer/lenguaje/{id}")
    public Lenguaje traerLenguaje(@PathVariable int id){
        return iLengService.traerLenguaje(id);
    }
    @GetMapping("/traer/lenguajes")
    public List<Lenguaje> traerListaLenguajes(){
        return iLengService.traerListaLenguajes();
    }
    
    @DeleteMapping("/eliminar/lenguaje/{id}")
    public String eliminarLenguaje(@PathVariable int id){
        iLengService.eliminarLenguaje(id);
        return "Lenguaje eliminado correctamente!";
    }
    
    @PutMapping("/editar/lenguaje/{id}")
    public String editarLenguaje(@PathVariable int id,
                                 @RequestParam ("nombre") String nuevoNombre,
                                 @RequestParam ("porcentaje") String nuevoPorcentaje){
        iLengService.editarLenguaje(id, nuevoNombre, nuevoPorcentaje);
        
        return "Lenguaje editado correctamente!";
    }
}
