package com.jordy.backend.resources;

import com.jordy.backend.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<?>> getOrders(){
        return ResponseEntity.ok().body(orderService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getOrder(@PathVariable Integer id){
        return ResponseEntity.ok().body(orderService.findOne(id));
    }
}
