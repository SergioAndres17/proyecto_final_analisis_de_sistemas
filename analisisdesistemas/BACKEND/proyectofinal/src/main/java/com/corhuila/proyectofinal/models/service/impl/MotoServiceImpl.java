package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IMotoDao;
import com.corhuila.proyectofinal.models.entity.Moto;
import com.corhuila.proyectofinal.models.service.IMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MotoServiceImpl implements IMotoService {
    @Autowired
    private IMotoDao motoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Moto> findAll() {
        return (List<Moto>) motoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Moto findById(Integer idMoto) {
        return motoDao.findById(idMoto).orElse(null);
    }

    @Override
    @Transactional
    public Moto save(Moto moto) {
        return motoDao.save(moto);
    }

    @Override
    @Transactional
    public Moto update(Moto moto, Integer idMoto) {
        Moto moto1 = this.findById(idMoto);
        moto1.setModelo(moto.getModelo());
        moto1.setMarca(moto.getMarca());
        moto1.setPrecio(moto.getPrecio());
        moto1.setAnio(moto.getAnio());
        moto1.setColor(moto.getColor());
        moto1.setStock(moto.getStock());
        return motoDao.save(moto1);
    }



    @Override
    @Transactional
    public void delete(Integer idMoto) {
        motoDao.deleteById(idMoto);

    }
}
