package alura.once.crea_api_rest.medico;

import alura.once.crea_api_rest.direccion.DatosDireccion;
import alura.once.crea_api_rest.direccion.Direccion;
import jakarta.persistence.*;

@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private  String nombre;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;
}
