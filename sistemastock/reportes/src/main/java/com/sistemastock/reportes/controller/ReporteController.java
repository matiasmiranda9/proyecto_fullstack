package com.sistemastock.reportes.controller;

import com.sistemastock.reportes.model.Reporte;
import com.sistemastock.reportes.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping
    public List<Reporte> listarTodos() {
        return reporteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Reporte> obtenerPorId(@PathVariable Long id) {
        return reporteService.obtenerPorId(id);
    }

    @PostMapping
    public Reporte crearReporte(@RequestBody Reporte reporte) {
        return reporteService.guardarReporte(reporte);
    }

    @DeleteMapping("/{id}")
    public void eliminarReporte(@PathVariable Long id) {
        reporteService.eliminarReporte(id);
    }
}