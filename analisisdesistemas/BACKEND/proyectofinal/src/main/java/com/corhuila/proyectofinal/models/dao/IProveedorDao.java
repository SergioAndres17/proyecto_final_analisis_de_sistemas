package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface IProveedorDao extends CrudRepository<Proveedor, Integer> {
}
