package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Dev dev) {
        super(dev);
    }

    public String sendWeekReport() {
        return " Send week report to customer ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }

}
