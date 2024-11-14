package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IVendedorDao;
import com.corhuila.proyectofinal.models.entity.Vendedor;
import com.corhuila.proyectofinal.models.service.IVendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VendedorServiceImpl implements IVendedorService {
    @Autowired
    private IVendedorDao vendedorDao;
    @Override
    @Transactional(readOnly = true)
    public List<Vendedor> findAll() {
        return (List<Vendedor>) vendedorDao.findAll();
    }
}
