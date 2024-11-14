package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.DetalleCompra;
import org.springframework.data.repository.CrudRepository;

public interface IDetalleCompraDao extends CrudRepository<DetalleCompra, Integer> {
}
