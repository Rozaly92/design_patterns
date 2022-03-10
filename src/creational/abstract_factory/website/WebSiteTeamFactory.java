package creational.abstract_factory.website;

import creational.abstract_factory.Developer2;
import creational.abstract_factory.ProjectManager;
import creational.abstract_factory.ProjectTeamFactory;
import creational.abstract_factory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer2 getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
