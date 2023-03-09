package api.portfolio.springboot.Experiencia.Service;

import api.portfolio.springboot.Experiencia.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService{
    public void crearExperiencia(Experiencia exp);
    public void eliminarExperiencia(int id);
    public List<Experiencia>traerListaExperiencia();
    public void editarExperiencia(int id, String nuevoPuesto, String nuevaCompania, String nuevaFechaInicio, String nuevaFechaFinal);
}
