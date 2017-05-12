package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleTestRestClass {

	private static final Logger log = Logger.getLogger(SimpleTestRestClass.class);

	public SimpleTestRestClass() {
		log.info("Object SimpleTestRestClass created..");
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public String getInfo() {
		log.info("INVOKE getInfo..");
		return "TEST!";
	}
}
