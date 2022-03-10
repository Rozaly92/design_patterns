package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer3> developers = new ArrayList<>();

    public void addDeveloper(Developer3 developer){
        developers.add(developer);
    }

    public void removeDeveloper(Developer3 developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Team creates projects...");
        for(Developer3 dev : developers){
            dev.writeCode();
        }
    }
}
