package com.idat.serviciopizzeria.serviciopizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.serviciopizzeria.serviciopizzeria.model.Pizzeria;
import com.idat.serviciopizzeria.serviciopizzeria.repository.PizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements PizzeriaService{

    @Autowired
    private PizzeriaRepository repository;

    @Override
    public List<Pizzeria> listar() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public void guardar(Pizzeria pizzeria) {
        repository.save(pizzeria);
        
    }
    
}
