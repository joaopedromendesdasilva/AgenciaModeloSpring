package com.springprojeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojeto.model.Destino;
import com.springprojeto.repositories.DestinoRepository;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;

    public List<Destino> listarDestinos() {
        return destinoRepository.findAll();
    }

    public Destino obterDestinoPorId(int id) {
        return destinoRepository.findById(id).orElse(null);
    }

    public void salvarDestino(Destino destino) {
        destinoRepository.save(destino);
    }

    public void deletarDestino(int id) {
        destinoRepository.deleteById(id);
    }
}
