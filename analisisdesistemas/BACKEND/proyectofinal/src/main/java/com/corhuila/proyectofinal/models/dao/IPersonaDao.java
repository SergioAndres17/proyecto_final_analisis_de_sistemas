package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Integer> {
}
