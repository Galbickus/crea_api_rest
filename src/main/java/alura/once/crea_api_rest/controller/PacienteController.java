package alura.once.crea_api_rest.controller;

import alura.once.crea_api_rest.dto.DatosRegistroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @PostMapping
    public void registrar(@RequestBody DatosRegistroPaciente datos){
        System.out.println("datos recibidos: " + datos);
    }
}
