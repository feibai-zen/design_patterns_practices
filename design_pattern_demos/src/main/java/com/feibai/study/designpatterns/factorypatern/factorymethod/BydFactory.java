package com.feibai.study.designpatterns.factorypatern.factorymethod;

import com.feibai.study.designpatterns.factorypatern.bean.Byd;
import com.feibai.study.designpatterns.factorypatern.bean.Car;

public class BydFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Byd();
	}

}
