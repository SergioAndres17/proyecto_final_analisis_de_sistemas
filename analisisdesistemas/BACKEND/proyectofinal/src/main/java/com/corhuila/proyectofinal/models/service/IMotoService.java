package com.corhuila.proyectofinal.models.service;

import com.corhuila.proyectofinal.models.entity.Moto;

import java.util.List;

public interface IMotoService {
    public List<Moto> findAll();

    public Moto findById(Integer idMoto);

    public Moto save (Moto moto);

    public Moto update (Moto moto, Integer idMoto);

    public void delete (Integer idMoto);
}
