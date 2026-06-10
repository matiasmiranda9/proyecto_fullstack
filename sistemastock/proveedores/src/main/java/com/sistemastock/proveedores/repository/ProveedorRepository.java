package com.sistemastock.proveedores.repository;

import com.sistemastock.proveedores.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}