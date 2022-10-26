package com.codegym.model;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private Long id;
    private int orderCode;

    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(name = "customer_id")
    private Optional<Customer> customer;

    @ManyToOne(targetEntity = Book.class)
    @JoinColumn(name = "book_id")
    private Optional<Book> book;

    public Order(Long id, int orderCode, Optional<Customer> customer, Optional<Book> book) {
        this.id = id;
        this.orderCode = orderCode;
        this.customer = customer;
        this.book = book;
    }

    public Order(int orderCode, Optional<Customer> customer, Optional<Book> book) {
        this.orderCode = orderCode;
        this.customer = customer;
        this.book = book;
    }

    public Order(int orderCode, Optional<Book> book) {
        this.orderCode = orderCode;
        this.book = book;
    }

    public Order() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public Optional<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Optional<Customer> customer) {
        this.customer = customer;
    }

    public Optional<Book> getBook() {
        return book;
    }

    public void setBook(Optional<Book> book) {
        this.book = book;
    }
}
