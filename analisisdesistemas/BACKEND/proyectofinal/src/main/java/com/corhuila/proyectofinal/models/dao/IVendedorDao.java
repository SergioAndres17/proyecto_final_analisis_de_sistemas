package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.Vendedor;
import org.springframework.data.repository.CrudRepository;

public interface IVendedorDao extends CrudRepository<Vendedor, Integer> {
}
