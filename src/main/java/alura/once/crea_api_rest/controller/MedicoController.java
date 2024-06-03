package alura.once.crea_api_rest.controller;

import alura.once.crea_api_rest.medico.DatosRegistroMedicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    public void registrarMedico(@RequestBody DatosRegistroMedicos datosRegistroMedicos){

        System.out.println(datosRegistroMedicos);

    }
}
