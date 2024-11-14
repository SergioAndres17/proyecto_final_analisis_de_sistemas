package com.corhuila.proyectofinal.models.service.impl;

import com.corhuila.proyectofinal.models.dao.IClienteDao;
import com.corhuila.proyectofinal.models.dao.IPersonaDao;
import com.corhuila.proyectofinal.models.dto.ClienteDto;
import com.corhuila.proyectofinal.models.entity.Cliente;
import com.corhuila.proyectofinal.models.entity.Persona;
import com.corhuila.proyectofinal.models.service.ICLienteService;
import com.corhuila.proyectofinal.models.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ClienteServiceImpl implements ICLienteService {
    @Autowired
    private IClienteDao clienteDao;

    @Autowired
    private IPersonaDao personaDao;

    @Autowired
    private IPersonaService personaService;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Integer idCliente) {
        return clienteDao.findById(idCliente).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(ClienteDto cliente) {
        Persona persona = new Persona();
        persona.setNombre(cliente.getNombre());
        persona.setPrimerApellido(cliente.getPrimerApellido());
        persona.setSegundoApellido(cliente.getSegundoApellido());
        persona.setEmail(cliente.getEmail());
        persona.setTelefono(cliente.getTelefono());
        Persona personaCreada = personaDao.save(persona);

        Cliente clienteAgregar = new Cliente();
        clienteAgregar.setPersona(personaCreada);
        clienteAgregar.setCreatedAt(new Date());
        return clienteDao.save(clienteAgregar);
    }

    @Override
    @Transactional
    public Cliente update(ClienteDto cliente, Integer idCliente) {
        Cliente clienteConsulta = this.findById(idCliente);

        Persona persona = personaService.findById(clienteConsulta.getPersona().getIdPersona());
        persona.setNombre(cliente.getNombre());
        persona.setPrimerApellido(cliente.getPrimerApellido());
        persona.setSegundoApellido(cliente.getSegundoApellido());
        persona.setEmail(cliente.getEmail());
        persona.setTelefono(cliente.getTelefono());
        personaDao.save(persona);

        Cliente clienteAgregar = new Cliente();
        clienteAgregar.setUpdatedAt(new Date());
        return clienteDao.save(clienteAgregar);
    }


    @Override
    @Transactional
    public void delete(Integer idCliente) {
        clienteDao.deleteById(idCliente);
    }
}
