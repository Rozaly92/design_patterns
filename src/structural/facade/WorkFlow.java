package structural.facade;

public class WorkFlow {
    Developerr developerr = new Developerr();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developerr.doJobBeforeDeadLine(bugTracker);

        bugTracker.finishSprint();
        developerr.doJobBeforeDeadLine(bugTracker);
    }
}
