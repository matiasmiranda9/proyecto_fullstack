package com.sistemastock.inventario.controller;

import com.sistemastock.inventario.model.Inventario;
import com.sistemastock.inventario.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<Inventario> listarTodos() {
        return inventarioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Inventario> obtenerPorId(@PathVariable Long id) {
        return inventarioService.obtenerPorId(id);
    }

    @PostMapping
    public Inventario crearInventario(@RequestBody Inventario inventario) {
        return inventarioService.guardarInventario(inventario);
    }

    @DeleteMapping("/{id}")
    public void eliminarInventario(@PathVariable Long id) {
        inventarioService.eliminarInventario(id);
    }
}
