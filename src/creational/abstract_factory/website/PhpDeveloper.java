package creational.abstract_factory.website;

import creational.abstract_factory.Developer2;

public class PhpDeveloper implements Developer2 {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
