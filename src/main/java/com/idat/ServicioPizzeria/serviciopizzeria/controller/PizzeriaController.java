package com.idat.serviciopizzeria.serviciopizzeria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.serviciopizzeria.serviciopizzeria.model.Pizzeria;
import com.idat.serviciopizzeria.serviciopizzeria.service.PizzeriaService;

@RestController
@RequestMapping("/pizzeria")
public class PizzeriaController {
    private PizzeriaService service;

    @GetMapping
    public ResponseEntity<?> listar(){
        List<Pizzeria> listado = service.listar();
        return ResponseEntity.ok(listado);
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Pizzeria pizzeria){
        try {
            service.guardar(pizzeria);
            return ResponseEntity.ok("Guardado");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
