package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.DetalleCompra;
import com.corhuila.proyectofinal.models.service.IDetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DetalleCompraRestController {
    @Autowired
    private IDetalleCompraService detalleCompraService;
    @GetMapping("/detalleCompra")
    public List<DetalleCompra> index(){
        return detalleCompraService.findAll();
    }
}
