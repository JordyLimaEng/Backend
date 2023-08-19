package com.jordy.backend.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jordy.backend.domain.enums.ClientType;
import com.jordy.backend.domain.enums.StatusPayment;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment implements Serializable {

    @Id
    private Integer id;
    private Integer status;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    @MapsId
    private Order order;


    public Payment() {
    }

    public Payment(Integer id, StatusPayment status, Order order) {
        this.id = id;
        this.status = status.getCod();
        this.order = order;
    }


    public StatusPayment getStatus() {
        return StatusPayment.toEnum(status);
    }

    public void setStatus(StatusPayment statusPayment) {
        this.status = statusPayment.getCod();
    }
}
