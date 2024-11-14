package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.Compra;
import org.springframework.data.repository.CrudRepository;

public interface ICompraDao extends CrudRepository<Compra, Integer> {
}
