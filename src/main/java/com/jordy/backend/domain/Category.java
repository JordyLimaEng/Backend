package com.jordy.backend.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Category implements Serializable {

    private Integer id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
