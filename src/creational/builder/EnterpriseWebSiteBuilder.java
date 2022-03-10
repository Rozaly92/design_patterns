package creational.builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise website");
    }

    @Override
    void buildCms() {
webSite.setCms(Cms.ALIFRESCOo);
    }

    @Override
    void buildPrice() {
webSite.setPrice(10000);
    }
}
