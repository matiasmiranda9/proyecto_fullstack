package com.sistemastock.ventas.controller;

import com.sistemastock.ventas.model.Venta;
import com.sistemastock.ventas.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> listarTodas() {
        return ventaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Venta> obtenerPorId(@PathVariable Long id) {
        return ventaService.obtenerPorId(id);
    }

    @PostMapping
    public Venta crearVenta(@RequestBody Venta venta) {
        return ventaService.guardarVenta(venta);
    }

    @DeleteMapping("/{id}")
    public void eliminarVenta(@PathVariable Long id) {
        ventaService.eliminarVenta(id);
    }
}