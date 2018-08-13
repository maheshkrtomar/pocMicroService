package com.lamda.function.dagger.test;

import org.junit.Assert;
import org.junit.Test;

import com.lamda.function.dagger.Request;
import com.lamda.function.dagger.SampleLambda;

public class SampleLambdaTest {

	@Test
	public void testHandleRequestSuccess() {
		Assert.assertEquals("Hello FooBar", new SampleLambda().handleRequest(new Request(), null).getMessage());
	}
}
