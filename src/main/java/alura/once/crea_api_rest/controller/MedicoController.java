package alura.once.crea_api_rest.controller;

import alura.once.crea_api_rest.medico.DatosRegistroMedicos;
import alura.once.crea_api_rest.medico.Medico;
import alura.once.crea_api_rest.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void registrarMedico(@RequestBody DatosRegistroMedicos datosRegistroMedicos){

        medicoRepository.save(new Medico(datosRegistroMedicos));

    }
}
