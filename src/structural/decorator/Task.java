package structural.decorator;

public class Task {
    public static void main(String[] args) {
        Dev dev = new SeniorJavaDev(new JavaD());
        System.out.println(dev.makeJob());

        Dev dev2 = new JavaTeamLead(new SeniorJavaDev(new JavaD()));
        System.out.println(dev2.makeJob());


    }
}
