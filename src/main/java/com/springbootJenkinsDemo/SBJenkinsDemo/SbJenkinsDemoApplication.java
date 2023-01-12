package com.springbootJenkinsDemo.SBJenkinsDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbJenkinsDemoApplication {

	public static final Logger logger=LoggerFactory.getLogger(SbJenkinsDemoApplication.class);

	public static void main(String[] args) {



		logger.info("it is the continius integration");
		SpringApplication.run(SbJenkinsDemoApplication.class, args);
	}

}
