package structural.decorator;

public class SeniorJavaDev extends DeveloperDecorator {
    public SeniorJavaDev(Dev dev) {
        super(dev);
    }

    public String makeCodeReview() {
        return " make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
