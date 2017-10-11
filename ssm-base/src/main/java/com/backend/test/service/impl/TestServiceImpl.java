package com.backend.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.test.dao.TestMapper;
import com.backend.test.model.Test;
import com.backend.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{
    
    @Autowired
    private TestMapper testDao;
    
    public int insert(Test test) {
	return testDao.insert(test);
    }

}
