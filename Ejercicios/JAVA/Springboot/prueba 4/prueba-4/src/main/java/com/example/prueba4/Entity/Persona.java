package com.example.prueba4.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="humano")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "edad")
    private int edad;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "clave")
    private int clave;

}
