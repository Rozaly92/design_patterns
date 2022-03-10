package creational.abstract_factory.banking;

import creational.abstract_factory.Developer2;
import creational.abstract_factory.ProjectManager;
import creational.abstract_factory.ProjectTeamFactory;
import creational.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer2 getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
