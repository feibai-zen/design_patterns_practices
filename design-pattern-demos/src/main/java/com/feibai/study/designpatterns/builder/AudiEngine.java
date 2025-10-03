package com.feibai.study.designpatterns.builder;

public class AudiEngine implements Engine {
    private String name;

    public AudiEngine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
