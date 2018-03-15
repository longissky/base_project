package com.demo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getHelloWorld() {
        return "hello world";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String getHelloWorld2() {
        return "hello world2";
    }

    @RequestMapping(value = "/test5", method = RequestMethod.GET)
    public String getHelloWorld5() {
        return "hello world2";
    }
}
