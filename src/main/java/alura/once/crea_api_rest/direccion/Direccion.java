package alura.once.crea_api_rest.direccion;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "medicos")
@Entity(name = "Medico")
public class Direccion {
    private String calle;
    private Integer numero;
    private String complemento;
    private String distrito;
    private String ciudad;
}
