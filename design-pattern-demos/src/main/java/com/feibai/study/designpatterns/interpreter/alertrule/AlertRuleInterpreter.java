package com.feibai.study.designpatterns.interpreter.alertrule;

import java.util.Map;

public class AlertRuleInterpreter {
    private final Expression expression;

    public AlertRuleInterpreter(String ruleExpression){
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats){
       return expression.interpret(stats);
    }

}
