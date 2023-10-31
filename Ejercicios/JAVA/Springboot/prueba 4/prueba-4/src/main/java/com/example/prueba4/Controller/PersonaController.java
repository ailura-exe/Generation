package com.example.prueba4.Controller;


import com.example.prueba4.Entity.Persona;
import com.example.prueba4.Service.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Esta anotación nos permite envíar y recibir peticiones de nuestro programa*/
@RestController
/*Especifica el mapeo de l URL para todas las solicitudes que llegan a este controlador*/
@RequestMapping("CRUDRepo")
public class PersonaController
{
    /*Se utiliza para realizar la inyección de dependencias en las clases*/
    @Autowired
    /*Este código nos ayuda a heredar o traer los métodos que se insertaron en el service*/
    private PSIMPL psimpl;

    /*Esta anotación nos ayudará a mapear una solicitud GET*/
    @GetMapping
    @RequestMapping(value="ConsultarPersonas", method = RequestMethod.GET)
    /*Este método maneja la solicitud GET para consultar todas las personas insertadas
    Y si los datos son correctos, me mostrará un código de respuesta HTTP 200*/
    public ResponseEntity<?> ConsultarPersonas(){
        List<Persona> personaList = this.psimpl.ConsultarPersonas();
        return ResponseEntity.ok(personaList);
    }

    @PutMapping
    @RequestMapping(value = "CrearPersona",method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersona(@RequestBody Persona persona){
        Persona personaCrear = this.psimpl.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaCrear);
    }
    @PutMapping
    @RequestMapping(value = "ModificarPersona", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersona(@RequestBody Persona persona){
        Persona personaModificada=this.psimpl.ModificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Persona persona=this.psimpl.BuscarPersona(id);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPersona/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id){
        this.psimpl.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }
}