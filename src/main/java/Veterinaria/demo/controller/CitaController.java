package Veterinaria.demo.controller;

import Veterinaria.demo.model.CitaMedica;
import Veterinaria.demo.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas") // <--- Esto debe coincidir con la URL de Postman
public class CitaController {

    @Autowired
    private CitaRepository citaRepository;

    @GetMapping
    public List<CitaMedica> listar() {
        return citaRepository.findAll();
    }

    @PostMapping
    public CitaMedica crear(@RequestBody CitaMedica cita) {
        return citaRepository.save(cita);
    }
}
