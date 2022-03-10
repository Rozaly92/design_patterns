package structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDev()),
                new StockExchange(new CppDev())
        };

        for(Program program : programs){
            program.developProgram();
        }






    }
}
