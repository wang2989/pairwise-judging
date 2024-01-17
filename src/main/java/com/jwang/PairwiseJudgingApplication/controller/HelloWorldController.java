package com.jwang.PairwiseJudgingApplication.controller;

import com.jwang.PairwiseJudgingApplication.service.interfaces.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/default")
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping(value="/hello")
    public ResponseEntity<Object> hello() {
        return new ResponseEntity<>(helloWorldService.helloWorld(), HttpStatus.OK);
    }

    @PostMapping(value="/post")
    public ResponseEntity<Object> post(@RequestBody String string) {
        return ResponseEntity.ok().body("Called post route with value: " + string);
    }

    @PutMapping(value="/put")
    public ResponseEntity<Object> put(@RequestBody String string) {
        return ResponseEntity.ok().body("Called put route with value: " + string);
    }

    @DeleteMapping(value="/delete")
    public ResponseEntity<Object> delete(@RequestBody String string) {
        return ResponseEntity.ok().body("Called delete route with value: " + string);
    }


}
