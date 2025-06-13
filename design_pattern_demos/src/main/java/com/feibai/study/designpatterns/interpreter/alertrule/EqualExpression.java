package com.feibai.study.designpatterns.interpreter.alertrule;

import java.util.Map;

class EqualExpression implements Expression {
    private String key;
    private long value;

    public EqualExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");

        if (elements.length != 3 || !elements[1].trim().equals("==")) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0];
        this.value = Long.parseLong(elements[2].trim());
    }

    public EqualExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        long staValue = stats.get(key);

        return staValue == this.value;
    }
}