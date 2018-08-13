package com.lamda.function.dagger;

import javax.inject.Inject;

public class AggregateService implements IAggregateService {

	private final IFooService fooService;
	private final IBarService barService;

	@Inject
	public AggregateService(final IFooService fooService, IBarService barService) {
		this.fooService = fooService;
		this.barService = barService;
	}

	public String aggregate() {
		return "Hello "+ fooService.foo() + barService.bar();
	}

}
