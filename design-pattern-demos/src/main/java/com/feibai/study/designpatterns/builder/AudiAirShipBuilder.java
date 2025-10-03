package com.feibai.study.designpatterns.builder;

/**
 * 在Builder中进行零件生产，可以结合工厂模式、单例模式创建零件
 *
 * @author feibai
 */
public class AudiAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("构建Audi牌发动机！");
        return new AudiEngine("Audi牌发动机！");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建Audi逃逸塔");
        return new AudiEscapeTower("Audi牌逃逸塔");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建Audi轨道舱");
        return new AudiOrbitalModule("Audi牌轨道舱");
    }

}
