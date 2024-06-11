package alura.once.crea_api_rest.medico;

import alura.once.crea_api_rest.direccion.DatosDireccion;
import org.antlr.v4.runtime.misc.NotNull;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
