
package api.portfolio.springboot.Lenguaje.Service;

import api.portfolio.springboot.Lenguaje.Entity.Lenguaje;
import api.portfolio.springboot.Lenguaje.Repository.ILenguajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LenguajeService implements ILenguajeService{
    @Autowired
    private ILenguajeRepository lenguajeRepo;

    @Override
    public void crearLenguaje(Lenguaje lenguaje) {
        lenguajeRepo.save(lenguaje);
    }

    @Override
    public Lenguaje traerLenguaje(int id) {
        return lenguajeRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarLenguaje(int id) {
        lenguajeRepo.deleteById(id);
    }

    @Override
    public void editarLenguaje(int id, String nuevoNombre, String nuevoPorcentaje) {
        Lenguaje leng = lenguajeRepo.findById(id).orElse(null);
        
        leng.setNombre(nuevoNombre);
        leng.setConocimientoPorcentaje(nuevoPorcentaje);
        
        lenguajeRepo.save(leng);
    }
}
