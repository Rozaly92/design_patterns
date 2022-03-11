package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        System.out.println("----------------------");
        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        System.out.println("----------------------");
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.cloneProject();
        System.out.println(masterClone2);


    }
}
