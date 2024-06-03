package alura.once.crea_api_rest.medico;

import alura.once.crea_api_rest.direccion.DatosDireccion;

public record DatosRegistroMedicos(
        String nombre,
        String email,
        String documento,
        Especialidad especialidad,
        DatosDireccion datosDireccion
) {
}
