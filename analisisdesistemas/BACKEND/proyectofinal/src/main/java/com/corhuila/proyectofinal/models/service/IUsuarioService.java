package com.corhuila.proyectofinal.models.service;

import com.corhuila.proyectofinal.models.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> findAll();
}
