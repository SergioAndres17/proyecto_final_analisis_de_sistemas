package com.corhuila.proyectofinal.models.service;

import com.corhuila.proyectofinal.models.entity.Inventario;

import java.util.List;

public interface IInventarioService {
    public List<Inventario> findAll();
}
