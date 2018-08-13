package com.abc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello! " + name;
	}
}
