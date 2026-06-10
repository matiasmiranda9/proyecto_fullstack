package com.sistemastock.reportes.repository;

import com.sistemastock.reportes.model.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReporteRepository extends JpaRepository<Reporte, Long> {
}