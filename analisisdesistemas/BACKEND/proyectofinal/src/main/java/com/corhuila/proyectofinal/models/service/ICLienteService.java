package com.corhuila.proyectofinal.models.service;

import com.corhuila.proyectofinal.models.dto.ClienteDto;
import com.corhuila.proyectofinal.models.entity.Cliente;
import java.util.List;

public interface ICLienteService {
    public List<Cliente> findAll();

    public Cliente findById(Integer idCliente);

    public Cliente save (ClienteDto clienteDto);

    public Cliente update (ClienteDto clienteDto, Integer idCliente);

    public void delete (Integer idCliente);
}