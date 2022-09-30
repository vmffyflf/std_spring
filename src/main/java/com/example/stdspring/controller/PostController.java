package com.example.stdspring.controller;

import com.example.stdspring.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/post/hello")
public class PostController {
    @PostMapping(value = "/domain")
    public String postExam() {
        return "Hello world!!";
    }




}
