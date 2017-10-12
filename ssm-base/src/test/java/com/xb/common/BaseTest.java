package com.xb.common;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@ActiveProfiles("dev")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/application*.xml","classpath:/spring/springmvc.xml"})
@WebAppConfiguration
public class BaseTest {
	
	protected Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	protected WebApplicationContext webApplicationContext;

	protected MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	public BaseTest() {
		
	}
	
	protected void info(String message) {
		logger.info(message);
	}
	
	
	public static void main(String[] args) {
		Long time= (new Date()).getTime();
		Date date = null;
		//date = time;
	}

	
}