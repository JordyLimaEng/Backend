package com.jordy.backend.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    private String publicPlace;
    private String number;
    private String additionalInfo;
    private String district;
    private String zipCode;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Address() {}

    public Address(Integer id, String publicPlace, String number, String additionalInfo, String district, String zipCode, Client client, City city) {
        this.id = id;
        this.publicPlace = publicPlace;
        this.number = number;
        this.additionalInfo = additionalInfo;
        this.district = district;
        this.zipCode = zipCode;
        this.client = client;
        this.city = city;
    }
}
