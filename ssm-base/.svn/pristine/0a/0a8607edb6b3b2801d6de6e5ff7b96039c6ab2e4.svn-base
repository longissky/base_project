package com.backend.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.backend.test.model.Test;
import com.backend.test.service.TestService;

@Controller
@RequestMapping("test")
public class TestController {
    
    @Autowired
    private TestService testService;
    
    @ResponseBody
    @RequestMapping(value="/i", method = RequestMethod.GET)
    public String insert(){
	Test test = new Test();
	test.setId(1);
	test.setName("张三");
	testService.insert(test);
	return "44";
    }

}
