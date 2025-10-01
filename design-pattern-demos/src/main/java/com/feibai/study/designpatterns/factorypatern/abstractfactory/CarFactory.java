package com.feibai.study.designpatterns.factorypatern.abstractfactory;

public interface CarFactory {
	Engine createEngine();

	Seat createSeat();

	Tyre createTyre();
}
