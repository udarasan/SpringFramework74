package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
    @PostMapping
    public String post() {
        return "post";
    }

    @PutMapping
    public String put() {
        return "put";
    }
    @DeleteMapping
    public String delete() {
        return "delete";
    }
    @PatchMapping
    public String patch() {
        return "patch";

    }
}
