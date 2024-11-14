package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.DetalleVenta;
import com.corhuila.proyectofinal.models.service.IDetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DetalleVentaRestController {
    @Autowired
    private IDetalleVentaService detalleVentaService;
    @GetMapping("/detalleVenta")
    public List<DetalleVenta> index(){
        return detalleVentaService.findAll();
    }
}
