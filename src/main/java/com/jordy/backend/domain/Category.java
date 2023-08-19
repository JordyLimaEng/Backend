package com.jordy.backend.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "categories", fetch=FetchType.EAGER)
    
    private List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
