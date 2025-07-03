import java.util.Scanner;

abstract class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("The dog " + this.name + " says : Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("The cat " + this.name + " says : Meow!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input names for dog and cat
        
        System.out.print("Enter name of Dog : ");
        String dogName = scanner.nextLine();

        System.out.print("Enter name of Cat : ");
        String catName = scanner.nextLine();

        System.out.println();
        // Create Dog objects
        Animal dog = new Dog(dogName);
        dog.makeSound();

        // Create Cat objects
        Animal cat = new Cat(catName);
        cat.makeSound();


        scanner.close();
    }
}
