package com.springprojeto.service.impl;

import com.springprojeto.model.Cliente;
import com.springprojeto.repositories.ClienteRepository;
import com.springprojeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obterClientePorId(int id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void salvarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void deletarCliente(int id) {
        clienteRepository.deleteById(id);
    }
}
