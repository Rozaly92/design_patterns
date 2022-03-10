package creational.abstract_factory;

import creational.abstract_factory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {


        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer2 developer2 = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer2.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }

}
