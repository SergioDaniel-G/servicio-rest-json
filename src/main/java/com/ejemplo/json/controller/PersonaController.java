package com.ejemplo.json.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.json.entity.Persona;
import com.ejemplo.json.repository.PersonaRepositorio;

@RestController
public class PersonaController {

	/*
	 * solo ingresamos localhost:8080 sin ninguna ruta en el get para persistir los
	 * datos en formato json
	 */

	@Autowired
	private PersonaRepositorio repositorio;

	@GetMapping // el get sirve para una obtencion de datos//
	public List<Persona> listar() {
		return repositorio.findAll();

	}

	@PostMapping // el post sirve para una insercion de datos//
	public void insertar(@RequestBody Persona perso) { // requestbody convierte un json a objeto java
		repositorio.save(perso);

	}

	@PutMapping // el put sirve para una actualizacion de datos//
	public void actualizar(@RequestBody Persona perso) {
		repositorio.save(perso);

	}

	@DeleteMapping(value = "/{id}") // el delete sirve para una eliminacion de datos//
	public void delete(@PathVariable("id") Integer id) {
		repositorio.deleteById(id);

	}
}
