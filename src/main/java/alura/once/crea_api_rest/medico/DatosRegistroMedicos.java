package alura.once.crea_api_rest.medico;

import alura.once.crea_api_rest.DatosDireccion;

public record DatosRegistroMedicos(
        String nombre,
        String email,
        String documento,
        Especialidad especialidad,
        DatosDireccion direccion
) {
}
