package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.DetalleVenta;
import org.springframework.data.repository.CrudRepository;

public interface IDetalleVentaDao extends CrudRepository<DetalleVenta, Integer> {
}
