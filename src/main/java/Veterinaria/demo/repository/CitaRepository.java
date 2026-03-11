package Veterinaria.demo.repository;

import Veterinaria.demo.model.CitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<CitaMedica, Long> {
}
