package com.corhuila.proyectofinal.controllers;

import com.corhuila.proyectofinal.models.entity.Moto;
import com.corhuila.proyectofinal.models.entity.Persona;
import com.corhuila.proyectofinal.models.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PersonaRestController {
    @Autowired
    private IPersonaService personaService;
    @GetMapping("/persona")
    public List<Persona> index(){
        return personaService.findAll();
    }

    @GetMapping("/persona/{idPersona}")
    public Persona show(@PathVariable Integer idPersona){
        return personaService.findById(idPersona);
    }

    @PostMapping("/persona")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona create(@RequestBody Persona persona){
        return personaService.save(persona);
    }

    @PutMapping("/persona/{idPersona}")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona update(@RequestBody Persona persona, @PathVariable Integer idPersona){
        Persona persona1 = personaService.findById(idPersona);
        persona1.setNombre(persona.getNombre());
        persona1.setPrimerApellido(persona.getPrimerApellido());
        persona1.setSegundoApellido(persona.getSegundoApellido());
        persona1.setTelefono(persona.getTelefono());
        persona1.setEmail(persona.getEmail());

        return personaService.save(persona1);
    }

    @DeleteMapping("/persona/{idPersona}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer idPersona){
        personaService.delete(idPersona);
    }
}
