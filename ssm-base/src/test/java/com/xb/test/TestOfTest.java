package com.xb.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jw.test.service.TestService;

public class TestOfTest {
    
    @Autowired
    private TestService testService;
    
    @Test
    public void insert(){
	com.jw.test.model.Test test = new com.jw.test.model.Test();
	test.setId(1);
	test.setName("张三");
	testService.insert(test);
    }

}
