package com.jordy.backend.resources;

import com.jordy.backend.domain.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<ArrayList<Category>> getCategories(){
        Category cat1 = new Category(1, "Computers");
        Category cat2 = new Category(2, "Books");

        ArrayList<Category> categoryList = new ArrayList<>();
        categoryList.add(cat1);
        categoryList.add(cat2);

        return ResponseEntity.ok().body(categoryList);
    }
}
