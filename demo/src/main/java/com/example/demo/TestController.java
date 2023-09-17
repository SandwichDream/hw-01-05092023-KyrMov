package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String test0() {

        return "Here we are!";
    }

    @GetMapping("/boo")
    public String test() {

        return "Here boo is!";
    }

    @GetMapping("/boo/booson")
    public String test2() {

        return "Here booson is!";
    }
}