package com.abc.labda.function;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.model.EmployeeInputRequest;
import com.abc.model.EmplyeeResponse;

import me.ccampo.spring.aws.lambda.SpringRequestHandler;

public class MainHandler extends SpringRequestHandler<EmployeeInputRequest, EmplyeeResponse> {

	    
	    private static final ApplicationContext context =
	            new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

	    
	    public ApplicationContext getApplicationContext() {
	        return context;
	    }
}
