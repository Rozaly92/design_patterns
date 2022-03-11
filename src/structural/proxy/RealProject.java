package structural.proxy;

public class RealProject implements Project {
    private String url;

    public void load() {
        System.out.println("loading project from " + url);
    }

    @Override
    public void run() {
        System.out.println("running project " + url + " .... ");
    }

    public RealProject(String url) {
        this.url = url;
        load();
    }
}
