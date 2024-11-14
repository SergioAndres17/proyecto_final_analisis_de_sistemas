package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.Vendedor;
import com.corhuila.proyectofinal.models.service.IVendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class VendedorRestController {
    @Autowired
    private IVendedorService vendedorService;
    @GetMapping("/vendedor")
    public List<Vendedor> index(){
        return vendedorService.findAll();
    }
}
