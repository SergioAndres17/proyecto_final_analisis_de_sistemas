package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IDetalleVentaDao;
import com.corhuila.proyectofinal.models.entity.DetalleVenta;
import com.corhuila.proyectofinal.models.service.IDetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {
    @Autowired
    private IDetalleVentaDao detalleVentaDao;
    @Override
    @Transactional(readOnly = true)
    public List<DetalleVenta> findAll() {
        return (List<DetalleVenta>) detalleVentaDao.findAll();
    }
}
