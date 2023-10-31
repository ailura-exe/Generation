package com.example.prueba4.Repository;

import com.example.prueba4.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends CrudRepository<Persona, Integer> {
}
