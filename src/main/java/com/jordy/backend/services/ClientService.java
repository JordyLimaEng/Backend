package com.jordy.backend.services;

import com.jordy.backend.domain.Client;
import com.jordy.backend.repositories.ClientRepository;
import com.jordy.backend.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client findOne(Integer id) {
        Optional<Client> cat = clientRepository.findById(id);
        return cat.orElseThrow(() ->
            new ObjectNotFoundException("Object not found! id: " + id + ", Type: " + Client.class.getName())
        );
    }

    public List<Client> findAll(){
        Optional<List<Client>> clients = Optional.of(clientRepository.findAll());
        return clients.orElse(null);
    }
}
