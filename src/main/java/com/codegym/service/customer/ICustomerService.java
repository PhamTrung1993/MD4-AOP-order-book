package com.codegym.service.customer;

import com.codegym.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Optional<Customer> findById(Long id);
}
