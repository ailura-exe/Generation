package com.example.prueba1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // nos permite inicializar los datos que se enviarán al servidor
public class ejemploController {
    //nos ayuda a obterner el mensaje  que se envió
    @GetMapping ("/saludar")
    public String saludar(){
        return "!Bienvenidos a Springboot";
    }
}
