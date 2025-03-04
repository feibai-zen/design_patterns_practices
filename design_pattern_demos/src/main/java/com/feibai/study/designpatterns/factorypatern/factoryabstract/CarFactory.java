package com.feibai.study.designpatterns.factorypatern.factoryabstract;

public interface CarFactory {
	Engine createEngine();

	Seat createSeat();

	Tyre createTyre();
}
