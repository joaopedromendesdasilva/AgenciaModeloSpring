package com.springprojeto.service;

import com.springprojeto.model.Cliente;
import com.springprojeto.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente obterClientePorId(int id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void salvarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void deletarCliente(int id) {
        clienteRepository.deleteById(id);
    }
}