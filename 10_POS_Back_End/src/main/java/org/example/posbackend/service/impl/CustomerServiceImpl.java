package org.example.posbackend.service.impl;

import org.example.posbackend.dto.CustomerDTO;
import org.example.posbackend.entity.Customer;
import org.example.posbackend.repository.CustomerRepository;
import org.example.posbackend.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
       customerRepository.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
    }
}
