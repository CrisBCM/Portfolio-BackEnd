package api.portfolio.springboot.Projecto.Entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Projecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private String descripcion;
    private String img;
    private String url;

    public Projecto(String nombre, String descripcion, String img, String url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.url = url;
    }
}
