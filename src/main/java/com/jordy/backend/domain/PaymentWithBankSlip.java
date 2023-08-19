package com.jordy.backend.domain;

import com.jordy.backend.domain.enums.StatusPayment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class PaymentWithBankSlip extends Payment{

    private Date expirationDate;
    private Date paymentDate;

    public PaymentWithBankSlip() {
    }

    public PaymentWithBankSlip(Integer id, StatusPayment statusPayment, Order order, Date expirationDate, Date paymentDate) {
        this.setId(id);
        this.setStatus(statusPayment);
        this.setOrder(order);
        this.expirationDate = expirationDate;
        this.paymentDate = paymentDate;
    }
}
