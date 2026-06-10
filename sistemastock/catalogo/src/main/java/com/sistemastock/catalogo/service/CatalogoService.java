package com.sistemastock.catalogo.service;

import com.sistemastock.catalogo.model.Catalogo;
import com.sistemastock.catalogo.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoService {

    @Autowired
    private CatalogoRepository catalogoRepository;

    public List<Catalogo> obtenerTodos() {
        return catalogoRepository.findAll();
    }

    public Optional<Catalogo> obtenerPorId(Long id) {
        return catalogoRepository.findById(id);
    }

    public Catalogo guardarCatalogo(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }

    public void eliminarCatalogo(Long id) {
        catalogoRepository.deleteById(id);
    }
}