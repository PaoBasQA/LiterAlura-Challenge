package com.liter.alura.model;

import jakarta.persistence.*;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String idioma;
    private Integer descargas;

    @ManyToOne(cascade = CascadeType.ALL)
    private Autor autor;

    public Libro() {}

    public Libro(String titulo, String idioma, Integer descargas, Autor autor) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.descargas = descargas;
        this.autor = autor;
    }

    // Getters y Setters

    public String toString() {
        return "Título: " + titulo + "\nIdioma: " + idioma + "\nDescargas: " + descargas + "\n" + autor;
    }
}
