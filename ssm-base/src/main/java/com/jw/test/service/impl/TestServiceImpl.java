package com.jw.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jw.test.dao.TestMapper;
import com.jw.test.model.Test;
import com.jw.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{
    
    @Autowired
    private TestMapper testDao;
    
    public int insert(Test test) {
	return testDao.insert(test);
    }

}
