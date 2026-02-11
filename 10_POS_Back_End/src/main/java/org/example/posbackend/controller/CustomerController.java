package org.example.posbackend.controller;

import org.example.posbackend.dto.CustomerDTO;
import org.example.posbackend.service.CustomerService;
import org.example.posbackend.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
    }

    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
    }
}
