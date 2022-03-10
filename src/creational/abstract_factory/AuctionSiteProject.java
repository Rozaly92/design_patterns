package creational.abstract_factory;

import creational.abstract_factory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer2 developer2 = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer2.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
