package com.example.prueba4.Service;

import com.example.prueba4.Entity.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona>ConsultarPersonas();

    public Persona CrearPersona(Persona persona);

    public Persona ModificarPersona(Persona persona);

    public Persona BuscarPersona(int id);

    public void EliminarPersona(int id);
}
