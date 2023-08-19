package com.jordy.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false, cacheStrategy = EqualsAndHashCode.CacheStrategy.LAZY, onlyExplicitlyIncluded = true)
@Entity
public class OrderItem implements Serializable {

    @JsonIgnore
    @EmbeddedId
    @EqualsAndHashCode.Include
    private OrderItemPK id = new OrderItemPK();

    private Double discount;
    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Double discount, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.discount = discount;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct(){
        return id.getProduct();
    }

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }

}
