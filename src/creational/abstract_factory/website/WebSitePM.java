package creational.abstract_factory.website;

import creational.abstract_factory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebSite PM manages website project...");
    }
}
