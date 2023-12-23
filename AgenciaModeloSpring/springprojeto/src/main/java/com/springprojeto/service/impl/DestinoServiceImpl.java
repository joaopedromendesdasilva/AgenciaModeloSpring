package com.springprojeto.service.impl;

import com.springprojeto.model.Destino;
import com.springprojeto.repositories.DestinoRepository;
import com.springprojeto.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoServiceImpl implements DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;

    @Override
    public List<Destino> listarDestinos() {
        return destinoRepository.findAll();
    }

    @Override
    public Destino obterDestinoPorId(int id) {
        return destinoRepository.findById(id).orElse(null);
    }

    @Override
    public void salvarDestino(Destino destino) {
        destinoRepository.save(destino);
    }

    @Override
    public void deletarDestino(int id) {
        destinoRepository.deleteById(id);
    }
}
