package com.jordy.backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "City")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    public City() {
    }

    public City(Integer id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }
}
