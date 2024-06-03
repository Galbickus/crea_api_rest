package alura.once.crea_api_rest.dto;

import alura.once.crea_api_rest.direccion.DatosDireccion;

public record DatosRegistroPaciente(
        String nombre,
        String email,
        String telefono,
        String documentoIdentidad,
        DatosDireccion direccion
) {
}
