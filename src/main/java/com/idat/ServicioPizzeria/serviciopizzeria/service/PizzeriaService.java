package com.idat.serviciopizzeria.serviciopizzeria.service;

import java.util.List;

import com.idat.serviciopizzeria.serviciopizzeria.model.Pizzeria;

public interface PizzeriaService {
    public List<Pizzeria> listar();
    public void guardar(Pizzeria pizzeria);
}
