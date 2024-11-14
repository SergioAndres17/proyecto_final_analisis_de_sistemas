package com.corhuila.proyectofinal.models.service;

import com.corhuila.proyectofinal.models.entity.Moto;
import com.corhuila.proyectofinal.models.entity.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> findAll();

    public Persona findById(Integer idPersona);

    public Persona save (Persona persona);

    public void delete (Integer idPersona);
}
