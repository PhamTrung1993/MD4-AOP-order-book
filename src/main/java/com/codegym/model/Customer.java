package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id

    private Long id;
    private String customerName;

    public Customer() {
    }

    public Customer(Long id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
