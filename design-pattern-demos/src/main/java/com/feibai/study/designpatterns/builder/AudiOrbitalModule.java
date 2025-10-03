package com.feibai.study.designpatterns.builder;

public class AudiOrbitalModule implements OrbitalModule {
    private String name;

    public AudiOrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
