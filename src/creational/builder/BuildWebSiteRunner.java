package creational.builder;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);


        Director director2 = new Director();
        director2.setBuilder(new EnterpriseWebSiteBuilder());
        WebSite webSite2 = director2.buildWebSite();
        System.out.println(webSite2);


    }
}
