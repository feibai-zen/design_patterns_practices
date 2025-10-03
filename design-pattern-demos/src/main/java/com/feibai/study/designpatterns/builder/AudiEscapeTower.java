package com.feibai.study.designpatterns.builder;

class AudiEscapeTower implements EscapeTower {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AudiEscapeTower(String name) {
        super();
        this.name = name;
    }

}
