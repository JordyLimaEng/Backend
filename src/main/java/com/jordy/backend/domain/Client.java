package com.jordy.backend.domain;

import com.jordy.backend.domain.enums.ClientType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String legalDocumentNumber;
    private Integer type;

    @OneToMany(mappedBy = "client")
    private List<Address> addresses = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "PHONE")
    private Set<String> phone = new HashSet<>();

    public Client() {}

    public Client(Integer id, String name, String email, String legalDocumentNumber, ClientType type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.legalDocumentNumber = legalDocumentNumber;
        this.type = type.getCod();
    }

    public ClientType getType() {
        return ClientType.toEnum(type);
    }

    public void setType(ClientType type) {
        this.type = type.getCod();
    }
}
