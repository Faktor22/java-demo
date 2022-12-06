package com.example.javademo.controller;

import com.example.javademo.domain.Client;
import com.example.javademo.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller


@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClient(){
        List<Client> allClients = clientService.findAllClient();
        return new ResponseEntity<>(allClients, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Long id) {
        Client client = clientService.findClientById(id);
        return ResponseEntity.ok(client);
    }

    @PostMapping("/add")
    public void addClient(@RequestBody Client client) {
        clientService.addClient(client);
    }
}