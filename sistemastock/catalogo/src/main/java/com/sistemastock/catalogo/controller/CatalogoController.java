package com.sistemastock.catalogo.controller;

import com.sistemastock.catalogo.model.Catalogo;
import com.sistemastock.catalogo.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    // GET: http://localhost:8080/api/catalogo
    @GetMapping
    public List<Catalogo> listarTodos() {
        return catalogoService.obtenerTodos();
    }

    // GET: http://localhost:8080/api/catalogo/1
    @GetMapping("/{id}")
    public Optional<Catalogo> obtenerPorId(@PathVariable Long id) {
        return catalogoService.obtenerPorId(id);
    }

    // POST: http://localhost:8080/api/catalogo
    @PostMapping
    public Catalogo crearCatalogo(@RequestBody Catalogo catalogo) {
        return catalogoService.guardarCatalogo(catalogo);
    }

    // DELETE: http://localhost:8080/api/catalogo/1
    @DeleteMapping("/{id}")
    public void eliminarCatalogo(@PathVariable Long id) {
        catalogoService.eliminarCatalogo(id);
    }
}