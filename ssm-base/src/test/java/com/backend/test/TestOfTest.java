package com.backend.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.backend.test.service.TestService;

public class TestOfTest {
    
    @Autowired
    private TestService testService;
    
    @Test
    public void insert(){
	com.backend.test.model.Test test = new com.backend.test.model.Test();
	test.setId(1);
	test.setName("张三");
	testService.insert(test);
    }

}
