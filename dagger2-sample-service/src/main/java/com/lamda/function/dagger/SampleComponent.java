package com.lamda.function.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { SampleModule.class })
public interface SampleComponent {

	IAggregateService aggregate();
}
