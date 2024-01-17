package com.jwang.PairwiseJudgingApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value="/")
    public String hello() {
        return "Hello World";
    }
}
