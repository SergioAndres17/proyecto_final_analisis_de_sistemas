package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IDetalleCompraDao;
import com.corhuila.proyectofinal.models.entity.DetalleCompra;
import com.corhuila.proyectofinal.models.service.IDetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetalleCompraServiceImpl implements IDetalleCompraService {
    @Autowired
    private IDetalleCompraDao detalleCompraDao;
    @Override
    @Transactional(readOnly = true)
    public List<DetalleCompra> findAll() {
        return (List<DetalleCompra>) detalleCompraDao.findAll();
    }
}
