package HierarchicalInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}
