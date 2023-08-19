package com.jordy.backend.domain.enums;

import lombok.Getter;

@Getter
public enum ClientType {

    INDIVIDUAL_PERSON(1, "Individual Person"),
    JURIDICAL_PERSON(2, "Juridical Person");

    private final int cod;
    private final String description;

    ClientType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public static ClientType toEnum(Integer cod){
        if(cod == null){
            return null;
        }

        for(ClientType c : ClientType.values()){
            if(cod.equals(c.getCod())){
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid code: " + cod);
    }
}
