package com.sistemastock.categorias.repository;

import com.sistemastock.categorias.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}