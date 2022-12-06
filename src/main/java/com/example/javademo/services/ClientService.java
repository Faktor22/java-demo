package com.example.javademo.services;

import com.example.javademo.domain.Client;
import com.example.javademo.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAllClient() {
        return clientRepository.findAll();
    }

    public void addClient(Client client) {
        clientRepository.save(client);
    }

    public Client findClientById(Long id) {
        return null;
    }
}