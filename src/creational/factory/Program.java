package creational.factory;

public class Program {
    public static void main(String[] args) {
//    DeveloperFactory developerFactory = new JavaDeveloperFactory();
//    Developer developer = developerFactory.createDeveloper();
//    developer.writeCode();
//
//    DeveloperFactory developerFactory1 = new CppDeveloperFactory();
//    Developer developer1 = developerFactory1.createDeveloper();
//    developer1.writeCode();


        //using static method
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

        DeveloperFactory developerFactory1 = createDeveloperBySpecialty("c++");
        Developer developer1 = developerFactory1.createDeveloper();
        developer1.writeCode();

        DeveloperFactory developerFactory2 = createDeveloperBySpecialty("php");
        Developer developer2 = developerFactory2.createDeveloper();
        developer2.writeCode();



    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
       if(specialty.equalsIgnoreCase("java")) {
           return new JavaDeveloperFactory();
       }
       else if(specialty.equalsIgnoreCase("c++")){
           return new CppDeveloperFactory();
       }
       else if(specialty.equalsIgnoreCase("php")){
           return new PhpDeveloperFactory();
       }
       else {
           throw new RuntimeException(specialty + " is unknown specialty");
       }

    }
}
