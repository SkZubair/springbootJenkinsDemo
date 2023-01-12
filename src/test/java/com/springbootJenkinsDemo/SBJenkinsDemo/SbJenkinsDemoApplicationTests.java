package com.springbootJenkinsDemo.SBJenkinsDemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbJenkinsDemoApplicationTests {
	public static final Logger logger= LoggerFactory.getLogger(SbJenkinsDemoApplication.class);

	@Test
	void contextLoads() {
		
		logger.info("it is the test continius integration");
		assertEquals(true,true);

	}


}
