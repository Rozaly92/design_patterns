package creational.builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCOO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
