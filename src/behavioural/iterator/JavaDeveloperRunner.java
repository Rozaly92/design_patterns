package behavioural.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSql"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Roza Negrea", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + ", ");
        }


    }
}
