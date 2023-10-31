package com.example.prueba3.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class Usuario {
    @NotBlank(message="El nombre no puede estar vacío")
    private String nombre;
    @Email(message = "El email no es valido")
    private String email;
}
