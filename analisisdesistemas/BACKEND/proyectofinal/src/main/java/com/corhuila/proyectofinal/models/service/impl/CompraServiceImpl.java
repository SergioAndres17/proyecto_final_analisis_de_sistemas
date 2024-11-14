package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.ICompraDao;
import com.corhuila.proyectofinal.models.entity.Compra;
import com.corhuila.proyectofinal.models.service.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompraServiceImpl implements ICompraService {
    @Autowired
    private ICompraDao compraDao;
    @Override
    @Transactional(readOnly = true)
    public List<Compra> findAll() {
        return (List<Compra>) compraDao.findAll();
    }
}
