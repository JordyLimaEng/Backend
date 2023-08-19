package com.jordy.backend.domain.enums;

import lombok.Getter;

@Getter
public enum StatusPayment {

    PENDING(0, "Pending"),
    PAID(1, "Paid"),
    CANCELED(2, "Canceled");

    private final int cod;
    private final String description;

    StatusPayment(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public static StatusPayment toEnum(Integer cod){
        if(cod == null){
            return null;
        }

        for(StatusPayment c : StatusPayment.values()){
            if(cod.equals(c.getCod())){
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid statusPayment: " + cod);
    }
}
