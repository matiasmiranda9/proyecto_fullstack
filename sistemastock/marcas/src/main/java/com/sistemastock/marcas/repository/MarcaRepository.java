package com.sistemastock.marcas.repository;

import com.sistemastock.marcas.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}