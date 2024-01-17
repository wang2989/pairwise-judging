package com.jwang.PairwiseJudgingApplication.service;

import com.jwang.PairwiseJudgingApplication.service.interfaces.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String helloWorld() {
        return "Hello World";
    }
}
