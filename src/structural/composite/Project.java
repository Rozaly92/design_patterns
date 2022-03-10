package structural.composite;

import structural.bridge.Developer;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer3 firstJavaDev = new JavaDeveloper2();
        Developer3 secondJavaDev = new JavaDeveloper2();
        Developer3 cppDeveloper = new CppDeveloper3();

        team.addDeveloper(firstJavaDev);
        team.addDeveloper(secondJavaDev);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
