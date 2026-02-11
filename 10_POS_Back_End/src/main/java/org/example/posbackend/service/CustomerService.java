package org.example.posbackend.service;

import org.example.posbackend.dto.CustomerDTO;

public interface CustomerService {
    public void saveCustomer(CustomerDTO customerDTO);
    public void updateCustomer(CustomerDTO customerDTO);
}
