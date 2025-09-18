package com.feibai.study.designpatterns.factorypatern.factorymethod;

import com.feibai.study.designpatterns.factorypatern.bean.Audi;
import com.feibai.study.designpatterns.factorypatern.bean.Car;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
