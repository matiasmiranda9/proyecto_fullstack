package com.sistemastock.marcas.service;

import com.sistemastock.marcas.model.Marca;
import com.sistemastock.marcas.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> obtenerTodas() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> obtenerPorId(Long id) {
        return marcaRepository.findById(id);
    }

    public Marca guardarMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void eliminarMarca(Long id) {
        marcaRepository.deleteById(id);
    }
}