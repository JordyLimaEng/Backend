package com.jordy.backend.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jordy.backend.domain.enums.StatusPayment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class PaymentWithBankSlip extends Payment{

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date expirationDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
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
