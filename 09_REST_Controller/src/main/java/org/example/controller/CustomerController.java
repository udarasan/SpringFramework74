package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    //URL embbed - pathvarible,query params
    //header - key : value
    //body - x-www form url encoded,json,formdata,xml...

    @PostMapping()
    public String saveCustomer(
            @RequestParam("name") String name,
            @RequestParam("id")String id,
            @RequestParam("address")String address) {
        return "saved-2 " + name + " " + id + " " + address;
    }
    //Query String Parameters
    @GetMapping("/search")
    public String searchCustomer(@RequestParam("id") String id){
        return "search-3 " + id;
    }
    //Path Variable
    @DeleteMapping("{cid}")
    public String deleteCustomer(@PathVariable("cid") String cid){
        return "deleted-2 " + cid;
    }
}
