package com.idat.ServicioPizzeria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.ServicioPizzeria.model.Pizzeria;

@RepositoryRestResource(path = "/pizzeria")
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {

}
