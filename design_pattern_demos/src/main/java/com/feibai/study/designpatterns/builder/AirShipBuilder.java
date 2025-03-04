package com.feibai.study.designpatterns.builder;

public interface AirShipBuilder {
  Engine builderEngine();

  OrbitalModule builderOrbitalModule();

  EscapeTower builderEscapeTower();
}
