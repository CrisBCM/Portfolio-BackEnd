package api.portfolio.springboot.Experiencia.Service;

import api.portfolio.springboot.Experiencia.Entity.Experiencia;
import api.portfolio.springboot.Experiencia.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private IExperienciaRepository ExpRepo ;

    @Override
    public void crearExperiencia(Experiencia exp) {
        ExpRepo.save(exp);
    }

    @Override
    public void eliminarExperiencia(int id) {
        ExpRepo.deleteById(id);
    }

    @Override
    public List<Experiencia> traerListaExperiencia() {
        return ExpRepo.findAll();
    }

    @Override
    public void editarExperiencia(int id, String nuevoPuesto, String nuevaCompania, String nuevaFechaInicio, String nuevaFechaFinal) {
        Experiencia exp = ExpRepo.findById(id).orElse(null);
        
        exp.setPuesto(nuevoPuesto);
        exp.setCompania(nuevaCompania);
        exp.setFechaInicio(nuevaFechaInicio);
        exp.setFechaFinal(nuevaFechaFinal);
        
        ExpRepo.save(exp);
    }
}