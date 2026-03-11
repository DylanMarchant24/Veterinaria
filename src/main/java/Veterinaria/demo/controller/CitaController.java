package Veterinaria.demo.controller;

import Veterinaria.demo.model.CitaMedica;
import Veterinaria.demo.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class CitaController {

    private final CitaRepository citaRepository;

    @Autowired
    public CitaController(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @GetMapping
    public List<CitaMedica> listarTodas() {
        return citaRepository.findAll();
    }

    @PostMapping
    public CitaMedica crear(@RequestBody CitaMedica cita) {
        // el ID será generado automáticamente por la base de datos
        cita.setId(null);
        return citaRepository.save(cita);
    }
}
