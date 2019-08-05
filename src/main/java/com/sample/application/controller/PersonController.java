package com.sample.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
	      return "Hello World";
	}

	@RequestMapping(value = "/object")
	public Object object(@RequestBody Object object) {
	      return object;
	}

}
