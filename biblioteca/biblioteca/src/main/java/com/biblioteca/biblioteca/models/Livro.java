package com.biblioteca.biblioteca.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false, unique = true)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Livro() {
    }

    public Livro(Long id, String titulo, String isbn, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}