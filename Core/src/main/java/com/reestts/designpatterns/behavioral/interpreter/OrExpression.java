package com.reestts.designpatterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpression.interpret(context);
    }
}
