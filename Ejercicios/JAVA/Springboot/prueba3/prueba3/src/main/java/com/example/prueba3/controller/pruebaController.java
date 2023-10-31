package com.example.prueba3.controller;

import com.example.prueba3.Entity.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class pruebaController {
    @PostMapping ("/usuarios")
    public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body("El usuario fue creado correctamente: \nNombre: " + usuario.getNombre() +"\nEmail :" + usuario.getEmail());
    }
}
