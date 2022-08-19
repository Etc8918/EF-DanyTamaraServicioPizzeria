package com.idat.ServicioPizzeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pizerria")
public class Pizzeria  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizerria;
    private String direcccion;
    private String sede;
}
