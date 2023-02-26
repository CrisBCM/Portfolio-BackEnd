package api.portfolio.springboot.Persona.Entity;

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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombre;
    private String edad;
    private String telefono;
    private String email;
    private String descripcion;
    private String img;

    public Persona(String nombre, String edad, String telefono, String email, String descripcion, String img) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
        this.img = img;
    }  
    
}
