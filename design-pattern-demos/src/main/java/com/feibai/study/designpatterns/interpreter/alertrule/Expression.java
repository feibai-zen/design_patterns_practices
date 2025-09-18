package com.feibai.study.designpatterns.interpreter.alertrule;

import java.util.Map;

public interface Expression {

    boolean interpret(Map<String, Long> stats);
}
