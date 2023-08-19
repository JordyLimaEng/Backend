package com.jordy.backend.services;

import com.jordy.backend.domain.Category;
import com.jordy.backend.domain.Order;
import com.jordy.backend.repositories.CategoryRepository;
import com.jordy.backend.repositories.OrderRepository;
import com.jordy.backend.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order findOne(Integer id) {
        Optional<Order> cat = orderRepository.findById(id);
        return cat.orElseThrow(() ->
            new ObjectNotFoundException("Object not found! id: " + id + ", Type: " + Order.class.getName())
        );
    }

    public List<Order> findAll(){
        Optional<List<Order>> categories = Optional.of(orderRepository.findAll());
        return categories.orElse(null);
    }
}
