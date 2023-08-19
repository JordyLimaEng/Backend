package com.jordy.backend.resources;

import com.jordy.backend.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @Autowired
    private ClientService ClientService;

    @GetMapping
    public ResponseEntity<List<?>> getClients(){
        return ResponseEntity.ok().body(ClientService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getClient(@PathVariable Integer id){
        return ResponseEntity.ok().body(ClientService.findOne(id));
    }
}
