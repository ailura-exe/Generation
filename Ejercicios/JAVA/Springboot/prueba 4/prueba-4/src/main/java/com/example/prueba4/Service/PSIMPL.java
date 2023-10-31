package com.example.prueba4.Service;

import com.example.prueba4.Entity.Persona;
import com.example.prueba4.Repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PersonaService {
    @Autowired
    private PersonaRepo repo;

    @Override
    public List<Persona> ConsultarPersonas(){
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona CrearPersona(Persona persona){
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    @Override
    public Persona ModificarPersona(Persona persona){
        return this.repo.save(persona);
    }

    @Override
    public Persona BuscarPersona(int id){
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarPersona(int id){
        this.repo.deleteById(id);
    }
}
