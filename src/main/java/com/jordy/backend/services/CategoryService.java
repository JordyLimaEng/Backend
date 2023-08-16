package com.jordy.backend.services;

import com.jordy.backend.domain.Category;
import com.jordy.backend.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findOne(Integer id) {
        Optional<Category> cat = categoryRepository.findById(id);
        return cat.orElse(null);
    }

    public List<Category> findAll(){
        Optional<List<Category>> categories = Optional.of(categoryRepository.findAll());
        return categories.orElse(null);
    }
}
