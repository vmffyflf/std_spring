package com.example.stdspring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delete/hello")
public class DeleteController {

    @DeleteMapping(value = "/{variable}")
    public String delVariable(@PathVariable String variable) {
        return variable;
    }

    @DeleteMapping(value = "resqt1")
    public String delResqt1(@RequestParam String sex){
        return "sex : " + sex;
    }


}
