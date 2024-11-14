package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.Compra;
import com.corhuila.proyectofinal.models.service.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CompraRestController {
    @Autowired
    private ICompraService compraService;
    @GetMapping("/compra")
    public List<Compra> index(){
        return compraService.findAll();
    }
}
