package com.ejemplo.json.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.json.entity.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

}
