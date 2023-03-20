
package api.portfolio.springboot.Projecto.Controller;

import api.portfolio.springboot.Projecto.Entity.Projecto;
import api.portfolio.springboot.Projecto.Service.IProjectoService;
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
public class ProjectoController {
    @Autowired
    private IProjectoService iProjectoService;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear/projecto")
    public String crearProjecto(@RequestBody Projecto proj){
        iProjectoService.crearProjecto(proj);
        return "Projecto creado correctamente";
    }
    
    @GetMapping("/traer/projectos")
    public List<Projecto> traerListaProjecto(){
        return iProjectoService.traerProjectos();
    }
    
    @DeleteMapping("/eliminar/projecto/{id}")
    public String eliminarProjecto(@PathVariable int id){
        iProjectoService.eliminarProjecto(id);
        return "Projecto eliminado correctamente!";
    }
    
    @PutMapping("/editar/projecto/{id}")
    public String editarProjecto(@PathVariable int id,
                                 @RequestParam ("nombre") String nuevoNombre,
                                 @RequestParam ("descripcion") String nuevaDescripcion,
                                 @RequestParam ("img") String nuevaImg,
                                 @RequestParam ("url") String nuevaUrl){
        iProjectoService.editarProjecto(id, nuevoNombre, nuevaDescripcion, nuevaImg, nuevaUrl);
        
        return "Projecto editado correctamente!";
    }
}
