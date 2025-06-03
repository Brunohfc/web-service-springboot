package com.brunohfcharles.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_orders")
public class Order implements Serializable {

    @ManyToOne
    @JoinColumn(name = "client_id")
    private  User client;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant momentOrder;

    public Order() {
    }

    public Order(User client, Integer id, Instant momentOrder) {
        this.client = client;
        this.id = id;
        this.momentOrder = momentOrder;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getMomentOrder() {
        return momentOrder;
    }

    public void setMomentOrder(Instant momentOrder) {
        this.momentOrder = momentOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
