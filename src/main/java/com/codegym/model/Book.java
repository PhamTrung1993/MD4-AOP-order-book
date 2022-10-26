package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id

    private Long id;
    private String bookName;
    private int quantityInStock;

    public Book() {
    }

    public Book(Long id, String bookName, int quantityInStock) {
        this.id = id;
        this.bookName = bookName;
        this.quantityInStock = quantityInStock;
    }

    public Book(String bookName, int quantityInStock) {
        this.bookName = bookName;
        this.quantityInStock = quantityInStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
