package com.sample.application.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
	      return "Hello World";
	}

	@RequestMapping(value = "/object", method = RequestMethod.GET)
	public Object object(@RequestHeader Map<String, String> headers, HttpServletRequest request) {
			System.out.println("Addr:" + request.getRemoteAddr());
			System.out.println("Host:" + request.getRemoteHost());
			System.out.println("Port:" + request.getRemotePort());
	      return headers;
	}

}
