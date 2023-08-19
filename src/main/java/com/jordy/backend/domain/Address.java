package com.jordy.backend.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String publicPlace;
    private String number;
    private String additionalInfo;
    private String district;
    private String zipCode;

    @JsonBackReference
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
