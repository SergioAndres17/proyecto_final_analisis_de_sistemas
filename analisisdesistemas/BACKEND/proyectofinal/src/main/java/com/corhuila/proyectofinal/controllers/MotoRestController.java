package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.Moto;
import com.corhuila.proyectofinal.models.service.IMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MotoRestController {
    @Autowired
    private IMotoService motoService;

    @GetMapping("/moto")
    public List<Moto> index(){
        return motoService.findAll();
    }

    @GetMapping("/moto/{idMoto}")
    public Moto show(@PathVariable Integer idMoto){
        return motoService.findById(idMoto);
    }

    @PostMapping("/moto")
    @ResponseStatus(HttpStatus.CREATED)
    public Moto create(@RequestBody Moto moto){
        return motoService.save(moto);
    }

    @PutMapping("/moto/{idMoto}")
    @ResponseStatus(HttpStatus.CREATED)
    public Moto update(@RequestBody Moto moto, @PathVariable Integer idMoto){

        return motoService.update(moto, idMoto);
    }

    @DeleteMapping("/moto/{idMoto}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer idMoto){
        motoService.delete(idMoto);
    }
}
