package creational.abstract_factory;

public interface ProjectTeamFactory {
    Developer2 getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
