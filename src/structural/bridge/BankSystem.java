package structural.bridge;

public class BankSystem extends Program {
    @Override
    public void developProgram() {
        System.out.println("BankSystem development in progress...");
    }

    public BankSystem(Developer developer) {
        super(developer);
    }
}
