package com.codegym.service.order;

import com.codegym.model.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<Order> findAll();
    Optional<Order> findById(Long id);
    void save(Order oder);
    void delete(Order order);
    Order findByOrderCode(int orderCode);
}
