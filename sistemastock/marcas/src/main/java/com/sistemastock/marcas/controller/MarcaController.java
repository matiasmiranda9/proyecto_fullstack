package com.sistemastock.marcas.controller;

import com.sistemastock.marcas.model.Marca;
import com.sistemastock.marcas.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<Marca> listarTodas() {
        return marcaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Marca> obtenerPorId(@PathVariable Long id) {
        return marcaService.obtenerPorId(id);
    }

    @PostMapping
    public Marca crearMarca(@RequestBody Marca marca) {
        return marcaService.guardarMarca(marca);
    }

    @DeleteMapping("/{id}")
    public void eliminarMarca(@PathVariable Long id) {
        marcaService.eliminarMarca(id);
    }
}