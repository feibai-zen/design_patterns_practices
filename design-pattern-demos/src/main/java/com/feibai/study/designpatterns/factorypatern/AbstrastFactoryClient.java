package com.feibai.study.designpatterns.factorypatern;

import com.feibai.study.designpatterns.factorypatern.abstractfactory.CarFactory;
import com.feibai.study.designpatterns.factorypatern.abstractfactory.Engine;
import com.feibai.study.designpatterns.factorypatern.abstractfactory.LuxuryCarFactory;

public class AbstrastFactoryClient {
  public static void main(String[] args) {
    CarFactory factory = new LuxuryCarFactory();
    Engine e = factory.createEngine();
    e.run();
    e.start();
  }
}
