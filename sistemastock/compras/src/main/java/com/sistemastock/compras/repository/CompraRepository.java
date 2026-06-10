package com.sistemastock.compras.repository;

import com.sistemastock.compras.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}