package api.portfolio.springboot.Experiencia.Entity;

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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String puesto;
    private String compania;
    private String fechaInicio;
    private String fechaFinal;

    public Experiencia(String puesto, String compania, String fechaInicio, String fechaFinal) {
        this.puesto = puesto;
        this.compania = compania;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }  
}
