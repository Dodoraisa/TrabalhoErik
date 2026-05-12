package com.biblioteca.biblioteca.repositories;

import com.biblioteca.biblioteca.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}