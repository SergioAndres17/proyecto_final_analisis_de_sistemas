package com.corhuila.proyectofinal.models.dao;

import com.corhuila.proyectofinal.models.entity.Moto;
import org.springframework.data.repository.CrudRepository;

public interface IMotoDao extends CrudRepository<Moto, Integer> {
}
