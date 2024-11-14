package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.Usuario;
import com.corhuila.proyectofinal.models.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService usuarioService;
    @GetMapping("/usuario")
    public List<Usuario> index(){
        return usuarioService.findAll();
    }
}
