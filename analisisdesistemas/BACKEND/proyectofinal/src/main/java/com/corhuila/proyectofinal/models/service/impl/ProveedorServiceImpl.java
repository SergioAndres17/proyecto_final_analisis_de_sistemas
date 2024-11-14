package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IProveedorDao;
import com.corhuila.proyectofinal.models.entity.Proveedor;
import com.corhuila.proyectofinal.models.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProveedorServiceImpl implements IProveedorService {
    @Autowired
    private IProveedorDao proveedorDao;
    @Override
    @Transactional(readOnly = true)
    public List<Proveedor> findAll() {
        return (List<Proveedor>) proveedorDao.findAll();
    }
}
