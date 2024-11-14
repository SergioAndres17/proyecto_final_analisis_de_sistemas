package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IInventarioDao;
import com.corhuila.proyectofinal.models.entity.Inventario;
import com.corhuila.proyectofinal.models.service.IInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventarioServiceImpl implements IInventarioService {
    @Autowired
    private IInventarioDao inventarioDao;
    @Override
    @Transactional(readOnly = true)
    public List<Inventario> findAll() {
        return (List<Inventario>) inventarioDao.findAll();
    }
}
