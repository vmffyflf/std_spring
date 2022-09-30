package com.example.stdspring.controller;


import com.example.stdspring.dto.MemberDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/get/hello")
public class GetController {
    @GetMapping(value = "caps/{caps}")
    public String hello(@PathVariable String caps ) {
        return caps;
    }

    @GetMapping(value = "/reqst")
    public String resq(@RequestParam String name, @RequestParam String sex, @RequestParam String age){
        return name + " " + sex + " " + age;
    }

    @GetMapping(value = "/reqst1")
    public String resq1(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping(value = "/reqst2")
    public String getReqst(MemberDto memberDto) {
        return memberDto.toString();
    }


    @ApiOperation(value = "Get method ex", notes = "@RequestParam을 활용함")
    @GetMapping(value = "/reqst3")
    public String getReqst1(
            @ApiParam(value = "이름", required = true) @RequestParam String name,
            @ApiParam(value = "성별", required = true) @RequestParam String sex,
            @ApiParam(value = "나이", required = true) @RequestParam String age
    ) {
    return name + " " + sex + " " + age;
    }



}
