package com.reestts.designpatterns.behavioral.interpreter;

public class MainInterpreter {

    public static void main(String[] args) {
        Expression isJavaSe = getJavaSeExpression();
        Expression isJavaEe = getJavaEeExpression();

        System.out.println("is developer know Java SE: " + isJavaSe.interpret("Java Core"));
        System.out.println("is developer know Java EE: " + isJavaEe.interpret("Java Spring"));
    }

    static Expression getJavaSeExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    static Expression getJavaEeExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
