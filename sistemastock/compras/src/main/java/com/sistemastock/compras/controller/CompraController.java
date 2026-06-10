package com.sistemastock.compras.controller;

import com.sistemastock.compras.model.Compra;
import com.sistemastock.compras.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> listarTodas() {
        return compraService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Compra> obtenerPorId(@PathVariable Long id) {
        return compraService.obtenerPorId(id);
    }

    @PostMapping
    public Compra crearCompra(@RequestBody Compra compra) {
        return compraService.guardarCompra(compra);
    }

    @DeleteMapping("/{id}")
    public void eliminarCompra(@PathVariable Long id) {
        compraService.eliminarCompra(id);
    }
}