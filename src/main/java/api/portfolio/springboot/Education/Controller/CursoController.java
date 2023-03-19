package api.portfolio.springboot.Education.Controller;

import api.portfolio.springboot.Education.Entity.Curso;
import api.portfolio.springboot.Education.Service.ICursoService;
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
public class CursoController {
    @Autowired
    private ICursoService cursoService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear/curso")
    public String crearCurso(@RequestBody Curso curso){
        cursoService.crearCurso(curso);
        return "Curso creado correctamente";
    }
    
    @GetMapping("/traer/cursos")
    public List<Curso> traerCursos(){
        return cursoService.traerCursos();
    }
    
    @DeleteMapping("/eliminar/curso/{id}")
    public String eliminarCurso(@PathVariable int id){
        cursoService.eliminarCurso(id);
        return "Curso eliminado correctamente!";
    }
    
    @PutMapping("/editar/curso/{id}")
    public String editarCurso(@PathVariable int id,
                                 @RequestParam ("nombre") String nuevoNombre,
                                 @RequestParam ("descripcion") String nuevaDescripcion,
                                 @RequestParam ("listaDeLenguajes") List<String> nuevaListaLenguajes)
                                 {
        cursoService.editarCurso(id, nuevoNombre, nuevaDescripcion, nuevaListaLenguajes);
        
        return "Curso editado correctamente!";
    }
}
