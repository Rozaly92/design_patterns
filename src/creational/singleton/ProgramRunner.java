package creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {

        ProgramLogger.getProgramLogger().addLogInfo("First logg...");
        ProgramLogger.getProgramLogger().addLogInfo("Second logg...");
        ProgramLogger.getProgramLogger().addLogInfo("Third logg...");

        ProgramLogger.getProgramLogger().showLogFile();


    }
}
