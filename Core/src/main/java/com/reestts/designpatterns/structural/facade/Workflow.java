package com.reestts.designpatterns.structural.facade;

public class Workflow {

    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    void resolveProblems(){
        job.doJob();
        bugTracker.startSpring();
        developer.doJobBeforeDeadline(bugTracker);
    }

}
