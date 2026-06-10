package com.sistemastock.compras.service;

import com.sistemastock.compras.model.Compra;
import com.sistemastock.compras.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> obtenerTodas() {
        return compraRepository.findAll();
    }

    public Optional<Compra> obtenerPorId(Long id) {
        return compraRepository.findById(id);
    }

    public Compra guardarCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public void eliminarCompra(Long id) {
        compraRepository.deleteById(id);
    }
}