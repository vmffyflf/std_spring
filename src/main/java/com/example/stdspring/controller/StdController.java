package com.example.stdspring.controller;

import com.example.stdspring.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/world/hello")
public class StdController {

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

    @PostMapping(value = "/domain")
    public String postExam() {
        return "Hello world!!";
    }

    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + '\n');
        });

        return sb.toString();
    }
    @PutMapping(value = "/member1")
    public String postMember1(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
    @PutMapping(value = "/member2")
    public String postMember2(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }


}
