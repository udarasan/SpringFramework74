package org.example.posbackend.controller;

import jakarta.validation.Valid;
import org.example.posbackend.dto.CustomerDTO;
import org.example.posbackend.service.CustomerService;
import org.example.posbackend.util.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public ResponseEntity<APIResponse<String>> saveCustomer(@RequestBody @Valid CustomerDTO customerDTO) {
            customerService.saveCustomer(customerDTO);
            return new ResponseEntity<>(new APIResponse<>
                    (201,"Customer Saved",null),
                    HttpStatus.CREATED);
    }

    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
    }
}
