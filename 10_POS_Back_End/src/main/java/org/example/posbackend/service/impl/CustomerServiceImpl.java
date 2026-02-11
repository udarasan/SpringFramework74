package org.example.posbackend.service.impl;

import org.example.posbackend.dto.CustomerDTO;
import org.example.posbackend.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        System.out.println(customerDTO.toString());
    }
}
