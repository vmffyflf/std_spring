package com.example.stdspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/world/hello")
public class StdController {

    @GetMapping(value = "caps/{caps}")
    public String hello(@PathVariable String caps ) {
        return caps;
    }

}
