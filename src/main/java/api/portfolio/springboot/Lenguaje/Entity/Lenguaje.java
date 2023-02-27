package api.portfolio.springboot.Lenguaje.Entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
@Entity
public class Lenguaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nombre;
    private String conocimientoPorcentaje;

    public Lenguaje(String nombre, String conocimientoPorcentaje) {
        this.nombre = nombre;
        this.conocimientoPorcentaje = conocimientoPorcentaje;
    }
}
