package com.reestts.designpatterns.structural.facade;

public class MainFacade {

    public static void main(String[] args) {
        Workflow workflow = new Workflow();

        workflow.resolveProblems();
    }
}
