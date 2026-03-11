package Veterinaria.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // datos del cliente
    private String nombreCliente;
    private String correo;
    private String telefono;

    // datos del animal
    private String nombreAnimal;
    private String tipoAnimal; // Perro o Gato
    private String raza;
    private Integer edad;
}
