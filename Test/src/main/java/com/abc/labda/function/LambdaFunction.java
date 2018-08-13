package com.abc.labda.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abc.model.EmployeeInputRequest;
import com.abc.model.EmplyeeResponse;
import com.abc.service.HelloService;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

@Component
public class LambdaFunction implements RequestHandler<EmployeeInputRequest, EmplyeeResponse>{
	
@Autowired 
private HelloService service;

public EmplyeeResponse handleRequest(EmployeeInputRequest request, Context arg1) {
	// 
	service.setName(request.getEmployeeId());
	EmplyeeResponse response=new EmplyeeResponse();
	response.setEmployeeId(service.sayHello());
	response.setCity(request.getAddress().getCity());
	return response;
}

	
}
	

