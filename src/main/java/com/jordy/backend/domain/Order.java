package com.jordy.backend.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "Orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date instant;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "order", fetch = FetchType.EAGER)
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "delivery_address_id")
    private Address deliveryAddress;

    @OneToMany(mappedBy = "id.order", fetch = FetchType.EAGER)
    private Set<OrderItem> itens = new HashSet<>();

    public Order() {
    }

    public Order(Integer id, Date instant, Client client, Address deliveryAddress) {
        this.id = id;
        this.instant = instant;
        this.client = client;
        this.deliveryAddress = deliveryAddress;
    }
}
