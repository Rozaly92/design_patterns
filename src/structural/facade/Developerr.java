package structural.facade;

public class Developerr {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        }else{
            System.out.println("developer is reading habr....");
        }
    }
}
