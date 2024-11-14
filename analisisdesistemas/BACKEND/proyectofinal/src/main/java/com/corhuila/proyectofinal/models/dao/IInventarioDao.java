package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.Inventario;
import org.springframework.data.repository.CrudRepository;

public interface IInventarioDao extends CrudRepository<Inventario, Integer> {
}
