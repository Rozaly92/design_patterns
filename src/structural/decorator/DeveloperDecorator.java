package structural.decorator;

public class DeveloperDecorator implements Dev {
    Dev dev;

    public DeveloperDecorator(Dev dev) {
        this.dev = dev;
    }

    @Override
    public String makeJob() {
        return dev.makeJob();
    }
}
