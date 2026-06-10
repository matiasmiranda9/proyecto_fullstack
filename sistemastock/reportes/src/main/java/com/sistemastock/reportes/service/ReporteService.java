package com.sistemastock.reportes.service;

import com.sistemastock.reportes.model.Reporte;
import com.sistemastock.reportes.repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    public List<Reporte> obtenerTodos() {
        return reporteRepository.findAll();
    }

    public Optional<Reporte> obtenerPorId(Long id) {
        return reporteRepository.findById(id);
    }

    public Reporte guardarReporte(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    public void eliminarReporte(Long id) {
        reporteRepository.deleteById(id);
    }
}