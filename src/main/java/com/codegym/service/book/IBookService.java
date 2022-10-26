package com.codegym.service.book;

import com.codegym.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    void save(Optional<Book> book);
}
