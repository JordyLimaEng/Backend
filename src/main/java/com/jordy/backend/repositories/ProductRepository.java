package com.jordy.backend.repositories;

import com.jordy.backend.domain.Category;
import com.jordy.backend.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
