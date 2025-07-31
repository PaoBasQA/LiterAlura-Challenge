package com.liter.alura.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer nacimiento;
    private Integer fallecimiento;

    public Autor() {}

    public Autor(String nombre, Integer nacimiento, Integer fallecimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.fallecimiento = fallecimiento;
    }

    // Getters y Setters

    public String toString() {
        return "Autor: " + nombre + " | Nacido: " + nacimiento + " | Fallecido: " + fallecimiento;
    }
}
