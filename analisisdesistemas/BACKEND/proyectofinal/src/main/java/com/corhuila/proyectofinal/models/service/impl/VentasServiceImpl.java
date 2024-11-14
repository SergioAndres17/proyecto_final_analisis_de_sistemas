package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IVentasDao;
import com.corhuila.proyectofinal.models.entity.Venta;
import com.corhuila.proyectofinal.models.service.IVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VentasServiceImpl implements IVentasService {
    @Autowired
    private IVentasDao ventasDao;
    @Override
    @Transactional(readOnly = true)
    public List<Venta> findAll() {
        return (List<Venta>) ventasDao.findAll();
    }
}
