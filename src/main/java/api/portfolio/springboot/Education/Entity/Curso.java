
package api.portfolio.springboot.Education.Entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private String descripcion;
    private List<String> lenguajesAprendidos;

    public Curso(String nombre, String descripcion, List<String> lenguajesAprendidos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lenguajesAprendidos = lenguajesAprendidos;
    }
}
