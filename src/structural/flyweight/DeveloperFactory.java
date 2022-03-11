package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer4> developers = new HashMap<>();

    public Developer4 getDeveloperBySpecialty(String specialty) {
        Developer4 dev = developers.get(specialty);
        if (dev == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    dev = new JavaDev();
                    break;
                case "c++":
                    System.out.println("hiring c++ developer...");
                    dev = new CppDev();
                    break;
            }
            developers.put(specialty, dev);
        }
        return dev;
    }
}
