package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.Venta;
import org.springframework.data.repository.CrudRepository;

public interface IVentasDao extends CrudRepository<Venta, Integer> {
}
