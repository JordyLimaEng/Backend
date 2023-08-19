package com.jordy.backend.domain.enums;

public enum ClientType {

    INDIVIDUAL_PERSON(1, "Individual Person"),
    JURIDICAL_PERSON(2, "Juridical Person");

    private int cod;
    private String description;

    ClientType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
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
