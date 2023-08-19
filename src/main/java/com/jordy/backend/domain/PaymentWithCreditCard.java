package com.jordy.backend.domain;

import com.jordy.backend.domain.enums.StatusPayment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class PaymentWithCreditCard extends Payment{

    private Integer installmentsNumber;

    public PaymentWithCreditCard() {
    }

    public PaymentWithCreditCard(Integer id, StatusPayment statusPayment, Order order, int installmentsNumber) {
        this.setId(id);
        this.setStatus(statusPayment);
        this.setOrder(order);
        this.installmentsNumber = installmentsNumber;
    }
}
