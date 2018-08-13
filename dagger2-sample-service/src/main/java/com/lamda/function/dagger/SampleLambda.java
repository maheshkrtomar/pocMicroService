package com.lamda.function.dagger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.lamda.function.dagger.DaggerSampleComponent;

public class SampleLambda implements RequestHandler<Request,Response>{

	private final SampleComponent component;
	
	public SampleLambda(){
		component = DaggerSampleComponent.builder().build();
	}
	
	@Override
	public Response handleRequest(Request request, Context ctx) {
		Response response = new Response();
		response.setMessage(component.aggregate().aggregate());
		return response;
	}

}
