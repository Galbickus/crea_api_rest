package alura.once.crea_api_rest.controller;

import alura.once.crea_api_rest.dto.DatosRegistroPaciente;

public class PacienteController {
    public void registrar(DatosRegistroPaciente datos){
        System.out.println("datos recibidos: " + datos);
    }
}
