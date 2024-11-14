package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.Venta;
import com.corhuila.proyectofinal.models.service.IVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class VentasRestController {
    @Autowired
    private IVentasService ventasService;
    @GetMapping("/ventas")
    public List<Venta> index(){
        return ventasService.findAll();
    }
}
