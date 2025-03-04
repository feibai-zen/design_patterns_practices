package com.feibai.study.designpatterns.factorypatern.factorymethod;

import com.feibai.study.designpatterns.factorypatern.bean.Benzi;
import com.feibai.study.designpatterns.factorypatern.bean.Car;

public class BenziFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Benzi();
	}
}
